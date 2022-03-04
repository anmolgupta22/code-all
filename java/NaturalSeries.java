
//5+25+125.................user defined

import java.util.Scanner;

public class NaturalSeries {
    public static void main(String[] args) {

        System.out.println("Print the sum of series");
        Scanner sc = new Scanner(System.in);
        int  t=1;
        //double num=sc.nextInt();
       int n = sc.nextInt();
       // System.out.println("Number of times="+num);
        for ( int i =-5; i <= n; i++) {
            t=n*t;
            System.out.print(t);
            System.out.print("+");
        }
        System.out.print("......................");
    }

}