////1.A certain grade of steel is graded according to the following conditions:
////        (i) Hardness must be greater than 50
////        (ii) Carbon content must be less than 0.7
////        (iii) Tensile strength must be greater than 5600
////        The grades are as follows:
////        Grade is 10 if all three conditions are met
////        Grade is 9 if conditions (i) and (ii) are met
////        Grade is 8 if conditions (ii) and (iii) are met
////        Grade is 7 if conditions (i) and (iii) are met
////        Grade is 6 if only one condition is met
////        Grade is 5 if none of the conditions are met
////Write a program, which will require the user to give values of hardness,
////carbon content and tensile strength of the steel under consideration and
////output the grade of the steel.
//
//package assignment3;
//
package assignment3;

import java.util.Scanner;

class Assigment3__1{

    public static void main(String arg[]) {
        float a = 0, b = 0, d = 0;
        float grade ;

        Scanner key = new Scanner(System.in);
        System.out.print("Enter the value of Hardness=");
        float h = key.nextInt();
        System.out.print("Enter the value of Carbon content=");
        float c = key.nextInt();
        System.out.print("Enter the value of tensile Strength=");
        float t = key.nextInt();


        if (h > 50)
            a = 1;

        if (c < 0.7)
            b = 1;

        if (t > 5600)
            d = 1;

        if (a == 1 && b == 1 && d == 1)

            System.out.println("grade 10");

       else if (a == 1 && d == 0 && c == 1)

         System.out.println("grade 9");

       else if (b == 1 && a == 0 && d == 1)

           System.out.println("grade 8");


       else if (a == 1 && b == 0 && d == 1)

        System.out.println("grade 7");

else if(a==1 || b==1 || c==1)



   System.out.println("grade 6");

        else


            System.out.println("grade 5");




    }
}

