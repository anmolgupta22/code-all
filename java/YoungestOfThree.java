//1.If the ages of Ram, Shyamand Ajay are input through the keyboard,
// write a program to determine the youngest of the three.

import java.util.Scanner;
public class YoungestOfThree {
    public static void main(String[] atrgs)
    {
        Scanner key=new Scanner(System.in);
        System.out.println("Ram age=");
        int a= key.nextInt();
        System.out.println("Shyam age=");
        int b=key.nextInt();
        System.out.println("Ajay age=");

        int c=key.nextInt();
int d= Math.min(c,Math.min(a,b));
        System.out.println("Youngers of three= "+d);
    }
}
