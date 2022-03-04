//class callme
//{
//    void call(String msg)
//    {
//        System.out.println("["+msg);
//        try {
//            Thread.sleep(1000);
//            }
//        catch (InterruptedException e)
//        {
//            System.out.println("Interrupted");
//        }
//        System.out.println("]");
//    }
//}
//class caller implements  Runnable
//{
//    String msg;
//    callme target;
//    Thread t;
//    public  caller(callme targ, String s)
//    {
//        target= targ;
//        msg=s;
//        t= new Thread(this);
//        t.start();
//    }
//    public void run()
//    {
//        target.call(msg);
//
//    }
//}
//
//
//
//public class try36 {
//    public static void main(String[] args) {
//        Callme target = new Callme();
//        Caller ob1 = new Caller(target, "Hello");
//        Caller ob2 = new Caller(target, "Synchronized");
//        Caller ob3 = new Caller(target, "World");
//
//
//    }
//}
