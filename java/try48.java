
class thread1 extends Thread
{
     @Override
     public void run()
     {int i;
         System.out.println("Thread t1 is running");
         for( i=1;i<=100;i++)
         {
             if ((i/ 7==0) || (i / 11==0)) {
                 System.out.println(i);

             }

         }
     }
 }
 class thread2 extends Thread
 {
 public void run()

 {

     System.out.println("thread t2 is running");

     for (int i=1;i<=100;i++)
     {
         if((i/5==0)||(i/13==0))
         {
             System.out.println(i);
         }

     }
 }
 }
public class try48 {
    public static void main(String[] args) {
        thread1 t1=new thread1();
        thread2 t12=new thread2();
        t1.start();
        t12.start();

    }
}
