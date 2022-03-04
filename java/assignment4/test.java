package assignment4;

import java.util.Scanner;
import java.lang.*;


public class test {
    public static void main(String arg[]) {


        Scanner key = new Scanner(System.in);
        System.out.println("Enter Username=");
        String username = key.nextLine();
        String checklist = "()[]{}!@#$%^&*=+-/? ";
        int flog = 0;
        if (username.length() >= 6 && username.length() <= 15) {

            if (username.charAt(0) >= 'A' && username.charAt(0) <= 'z') {
                for (int i = 0; i < checklist.length(); i++) {
                    String temp = String.valueOf(checklist.charAt(i));

                    if (username.contains(temp) == true) {
                        System.out.println("Invalid username " + username + " it show not contains:" + temp);
                        flog = 1;
                        System.exit(0);
                    }

                }
                if (flog == 0) {
                    System.out.println("Valid username: " + username);
                }


            }

        }
    }
}

