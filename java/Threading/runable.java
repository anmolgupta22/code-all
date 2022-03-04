package Threading;
import java.lang.*;

 class MyThread2 implements Runnable {
     public void run() {
         for (int i = 0; i <= 5; i++)
             System.out.println("Now the running threading1");
     }
 }
    class MyThread3 implements  Runnable
    {
        public void run()
        {
            for(int i=6;i<=10;i++)
            System.out.println("Now the running threading2");
        }
    }
class MyThread4 implements  Runnable
{
    public void run()
    {
        for(int i=11;i<=15;i++)
            System.out.println("Now the running threading3");
    }
}
class MyThread5 implements  Runnable
{
    public void run()
    {
        for(int i=16;i<=20;i++)
            System.out.println(" Now the running threading4");
    }
}
public class runable {
    public static void main(String[] args) {
        Runnable r1 = new MyThread2();
        Thread th1 = new Thread(r1,"My new1 thread");
        th1.start();
        String str1 = th1.getName();
        System.out.println(str1);
        Runnable r2 =new MyThread3();
        Thread th2=new Thread(r2,"My new2 thread");
        String str2= th2.getName();
        th2.start();
        System.out.println(str2);
        Runnable r3 =new MyThread4();
        Thread th3=new Thread(r3,"My new3 thread");
        String str3=th3.getName();
        th3.start();
        System.out.println(str3);
        Runnable r4 =new MyThread5();
        Thread th4=new Thread(r4,"My new4 thread");
        String str4=th4.getName();
        th4.start();
        System.out.println(str4);
    }
}
