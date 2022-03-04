package Assignment7;

import java.sql.Timestamp;

public class Qu_3 implements Runnable{

    Qu_3(){
        Thread t=new Thread(this);
        t.start();
    }
    @Override
    public void run(){

        Timestamp timestamp= new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);

        for(int i=0;i<10;i++)
            System.out.println("Namaste! ");
        try {
            Thread.sleep(1000);
            System.out.println("Anmol");
        }
        catch (Exception e) {

            System.out.println(e);
        }


    }
    public static void main(String[] args) {
        new Qu_3();
        //new Qu_3();

    }
}
