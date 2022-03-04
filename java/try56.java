
class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i = 0;

        while(i<100){
//            System.out.println("I am a thread");
            System.out.println("Thank you: " + this.getName());
            i++;
        }

    }
}

public class try56 {
    public static void main(String[] args) throws InterruptedException {
        // Ready Queue: T1 T2 T3 T4 T5

        MyThr1 t1 = new MyThr1("Harry1");
        MyThr1 t5 = new MyThr1("Harry5 (most Important)");
        t5.join();
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        //t5.setPriority(Thread.MIN_PRIORITY);

        t1.start();

        t5.start();

    }
}
