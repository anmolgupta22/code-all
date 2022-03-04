//1.A certain grade of steel is graded according to the following conditions:
//        (i) Hardness must be greater than 50
//        (ii) Carbon content must be less than 0.7
//        (iii) Tensile strength must be greater than 5600
//        The grades are as follows:
//        Grade is 10 if all three conditions are met
//        Grade is 9 if conditions (i) and (ii) are met
//        Grade is 8 if conditions (ii) and (iii) are met
//        Grade is 7 if conditions (i) and (iii) are met
//        Grade is 6 if only one condition is met
//        Grade is 5 if none of the conditions are met
//Write a program, which will require the user to give values of hardness,
//carbon content and tensile strength of the steel under consideration and
//output the grade of the steel.

import java.util.Scanner;

public class try5 {
    public static void main(String arg[]) {
        int a = 0, b = 0, d = 0;
        Scanner key = new Scanner(System.in);
        System.out.print("Enter the value of Hardness=");
        int h = key.nextInt();
        System.out.print("Enter the value of Carbon content=");
        int c = key.nextInt();
        System.out.print("Enter the value of tensile Strength=");
        int t = key.nextInt();
        System.out.println("grade of steel=");
        if(h>50 && c<0.7 &&t>5600){
            System.out.println("10");
        }
         if(h>50 && t>5600){
             System.out.println("9");
         }
if(c<0.7 && t>5600){
    System.out.println("8");

}
 if(h>50 && t>5600) {
     System.out.println("7");
 }
 if(h>50 || c<0.7 || t>5600)
 {
     System.out.println("6");

 }
 if(h<50 && c>0.7 && t<5600)
 {
     System.out.println("5");
 }
    }
    }