package multithreading;
 class thread1 implements Runnable {
  public void run()
    {
     for(int i=1;i<=10;i++)
     {
         System.out.println(i*i);
     }
    }
}
class thread21 implements Runnable{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i*i*i);
        }
    }
}
public class thread3{
    public static void main(String[] args) {
        thread1 th1 =new thread1();
        Thread t =new Thread(th1);
        thread21 th2=new thread21();
     Thread t1 =new Thread(th2);
     t.start();
     t1.start();
    }

}
