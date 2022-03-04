package face_java;
import java.util.Scanner;
public class qu12 {
    public static void main(String args[]) {
        String first = "Excelleyt";
        String second = "tnellecxE";
        int flag = 1, val = first.length() - 1;
        for (int i = 0; i < first.length(); i++) {
            if ((first.charAt(i)) != second.charAt(val - i)) {
                flag = 0;
            }
        }
        if (flag == 1)
            System.out.println("It is same");
        else
            System.out.println("It is not same");
    }
}