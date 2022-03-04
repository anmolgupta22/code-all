//Write a program to receive marks in A and B and Output whether the student has passed, failed or is allowed to reappear in B.


package assignment3;

import java.util.Scanner;

public class Assigment3_3 {
    public static void main(String arg[])
    {
        Scanner key=new Scanner(System.in);
        System.out.print("Enter the A and b Subject=");
        int a= key.nextInt();
        int b= key.nextInt();
if(a>=55 && b>=45)
{
    System.out.println("Student passed");
}
else if(a>=45 && a<55 && b>=55 ){
    System.out.println("Student passed");
}
else if(a>=66 &&b<45 )
{
    System.out.println(" reappear in an examination in B to qualify");
}
else
    System.out.println("student failed");
    }
}
