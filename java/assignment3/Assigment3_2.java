//2. In a company, worker efficiency is determined on the basis of the time
// required for a worker to complete a particular job. If the time taken by the
// worker is between 2 – 3 hours, then the worker is said to be highly efficient.
//If the time required by the worker is between 3 – 4 hours, then the worker is
//ordered to improve speed. If the time taken is between 4 – 5 hours, the worker
//is given training to improve his speed, and if the time taken by the worker is
//more than 5 hours, then the worker has to leave the company. If the time taken
//by the worker is input through the keyboard, find the efficiency of the worker.


package assignment3;

import java.util.Scanner;

public class Assigment3_2 {
    public static void main(String arg[]){
    Scanner key=new Scanner(System.in);
        System.out.println("time taken by the worker is");
  float a= key.nextInt();
  if(a>=2 && a==3 ) {
      System.out.println("highly efficient");
  }


       if(a>3 && a==4 )
    {
        System.out.println("improve speed");
    }
       if(a>4 && a==5){
           System.out.println("improve his speed");
       }
       if(a>5)
       {
           System.out.println("leave the company");
       }
}}


