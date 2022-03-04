package BasicLabProblems;

//import java.util.Scanner;
//
//class Sum {
//    private
//    double t;
//
//    public void sum1(double x, double y) {
//        t = x + y;
//        System.out.println("Total="+t);
//
//    }
//}
//public class Assignment_3 {
//
//   public static void main(String arg[]){
//       Scanner key=new Scanner(System.in);
//       System.out.print("Enter the number1=");
//       double x=key.nextDouble();
//       System.out.print("Enter the number2=");
//       double y=key.nextInt();
//       Sum s=new Sum();
//       s.sum1(x,y);
//
//
//   }
//}

 import java.lang.*;
import java.util.*;

class Asg3Q3
{

    public static void main(String [] aggs)
    {

        complex c=new complex();
        c.values();
        c.complexadd();
        c.display();
    }
}

class complex
{

    int real_a,real_b;
    int img_a,img_b;
    int real_c;
    int img_c;
    void values()
    {
        Scanner d=new Scanner(System.in);
        System.out.println("Enter the 1st complex number");
        System.out.println();
        System.out.println("Enter the real part");
        real_a=d.nextInt();
        System.out.println("Enter the img part");
        img_a=d.nextInt();
        System.out.println("Enter the 2nd complex number");
        System.out.println();
        System.out.println("Enter the real part");
        real_b=d.nextInt();
        System.out.println("Enter the img part");
        img_b=d.nextInt();

    }

    void complexadd()
    {

        real_c=real_a+real_b;
        img_c=img_a+img_b;
    }
    void display()
    {

        if(img_c<0)
        {
            System.out.println("The result is:  " +real_c+img_c+"i");
        }
        else
        {
            System.out.println("The result is:  " +real_c+"+"+img_c+"i");
        }
    }

}