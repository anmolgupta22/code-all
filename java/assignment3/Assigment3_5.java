package assignment3;

import java.util.Scanner;

public class Assigment3_5 {
    public static void main(String arg[]) {
        Scanner key = new Scanner(System.in);
        System.out.print("enter the any numbers=");
        double a = key.nextInt();
        if (a == 0) {
            System.out.println("Zero");
        }
        if (a < 0) {
            System.out.println("Negative");
        }
        if (a > 0) {
            System.out.println("Positive");
        }
    }
}