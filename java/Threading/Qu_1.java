package Threading;
import java.util.Scanner;
import java.lang.*;


class msg1 extends Thread
{
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println("Hello");
            int j=2*i;
            System.out.println(j);
        }
    }
}
class msg2 extends Thread
{
    public  void run()
    {
        for (int i=6;i<=10;i++)
        {
            System.out.println("Good Morning");
            int j=2*i;
            System.out.println(j);
        }
    }
}
class msg3 extends Thread
{
    public  void run()
    {
        for (int i=11;i<=15;i++)
        {
            System.out.println("Good Morning");
            int j=2*i;
            System.out.println(j);
        }
    }
}
public class Qu_1 {

    public static void main(String arg[])
    {

        msg1 key=new msg1();
        msg2 key1=new msg2();
        msg3 key2=new msg3();
        System.out.println("hi");
        key.start();
        key1.start();
        key2.start();
        System.out.println("Have a nice day...");
    }
}
