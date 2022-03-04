package multithreading;

    class MyThr extends Thread{
//        public MyThr(String name){
//            super(name);
//        }
        public void run(){
            int i = 34;
            System.out.println("Thank you");
//        while(true){
//            System.out.println("I am a thread");
//        }
        }
    }
public class constructor_thread {
        public static void main(String args[]) {

//            MyThr t1 = new MyThr("Harry");
//            MyThr t2 = new MyThr("Ram Candr");
            Runnable r =new MyThr();
            Thread r1 = new Thread(r,"my name is Anmol");
           r1.start();
            //t2.start();
           // System.out.println("The id of the thread t is " + r1.getId());
           // System.out.println("The name of the thread t is " + r1.getName());
            //System.out.println("The id of the thread t is " + r2.getId());
           // System.out.println("The name of the thread t is " + r2.getName());
        }
    }


