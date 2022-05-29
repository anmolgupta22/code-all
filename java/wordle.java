

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import static java.lang.System.in;


public class wordle {
    public static Scanner s = new Scanner(in);
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";


    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();
        int tries = 0;
int count=0;
        System.out.println("Welcome to Wordle Game :");
        System.out.println("******************************************************************************************");
        System.out.println("Type Five Letter Word :");
        String answerChoosen = ReturnRandomWord();
        char[] answer = new char[5];
        for (int i = 0; i < 5; i++) answer[i] = answerChoosen.charAt(i);
        char[] input = new char[5];
        boolean done = false;

        while (!done) {
            tries++;
            count++;
            if(count==7)
            {
                System.out.println("Maximum tries only 6 you can try again");
                System.exit(0);
            }
            String R1 = s.nextLine().toLowerCase();
            if (R1.length()<5)
            {
                System.out.println("Please enter the 5 Letter word only");
                System.exit(0);
            }
            else if (R1.length()>5){
                System.out.println("Please enter the 5 Letter word only");
                System.exit(0);
            }
            while (R1.length() < 5) {
                R1 = s.nextLine().toLowerCase();
            }
            for (int i = 0; i < 5; i++) { //puts the inputWord into a char[]
                answer[i] = answerChoosen.charAt(i);
                input[i] = R1.charAt(i);
            }
            if (PrintWordWithColor(input, answer)) done = true;
        }

        System.out.println("Hey, You Found The Answer in " + ((System.currentTimeMillis() - startTime) / 1000) + " seconds and " + tries + " tries.");
    }

    public static boolean PrintWordWithColor(char[] inputWord, char[] correctWord) {

        boolean correct = true;
        char[] answerTemp = correctWord;
        int[] colorForLetter = new int[5]; //0 is grey, yellow is 1, green is 2

        for (int i = 0; i < 5; i++) { //check for any correct position+letter (green)
            if (inputWord[i] == answerTemp[i]) {
                answerTemp[i] = '-';
                colorForLetter[i] = 2;
            } else correct = false;
        }

        for (int j = 0; j < 5; j++) { //check for any correct letter (yellow)
            for (int k = 0; k < 5; k++) {
                if (inputWord[j] == answerTemp[k] && colorForLetter[j] != 2) {
                    //if that letter is not already green and matches some other letter
                    colorForLetter[j] = 1;
                    answerTemp[k] = '-';
                }
            }
        }

        for (int m = 0; m < 5; m++) {
            if (colorForLetter[m] == 0) System.out.print(inputWord[m]);
            if (colorForLetter[m] == 1) System.out.print(ANSI_YELLOW + inputWord[m] + ANSI_RESET);
            if (colorForLetter[m] == 2) System.out.print(ANSI_GREEN + inputWord[m] + ANSI_RESET);
        }
        System.out.println("");


        return correct;

    }

    public static String ReturnRandomWord() throws IOException {

        String filePath = "C:\\Users\\gupta\\Downloads\\wordle.txt";

        Charset encoding = Charset.defaultCharset();

        List<String> lines = Files.readAllLines(Paths.get(filePath), encoding);

        String string = String.join("\n", lines);

        int list_size = lines.size();

        String[] strArray = new String[list_size];

        lines.toArray(strArray);

        for (int i = 0; i < strArray.length; i++) {


        }

        return strArray[(int) (Math.random() * (strArray.length - 1))];
    }
}




