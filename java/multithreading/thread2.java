package multithreading;

import org.codehaus.groovy.transform.ThreadInterruptibleASTTransformation;

class Mythread1  implements Runnable
{

    int a=0;
    @Override
public void run()
{
    while (a<20)
    {
        System.out.println("My thread is Running");
        System.out.println("I am happy!");
        a++;
    }
}
}
    class Mythread2 implements Runnable
        {

        int a=0;
@Override
public void run()
        {
        while (a<20)
        {
        System.out.println("My thread is Runningddfd23322");
        System.out.println("I am happy23432432dd!");
        a++;
        }
        }
        }
public class thread2 {
    public static void main(String arg[]){
Mythread1 bullet1=new Mythread1();
Thread gun1 =new Thread(bullet1);
Mythread2 bullet2 = new Mythread2();
Thread gun2 = new Thread(bullet2);
gun1.start();
gun2.start();
    }
}
