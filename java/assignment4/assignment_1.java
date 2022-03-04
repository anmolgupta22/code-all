package assignment4;


import java.util.Scanner;
import java.lang.*;

class assignment_1 {
    public static void main(String arg[]) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter text=");
        String a = key.nextLine();
        if (a.length() >= 6 && a.length() <= 10) {
            System.out.println(a);
        } else
            System.out.println("Invalid text!");

    }
}