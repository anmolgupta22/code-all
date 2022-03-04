package Assignment7;
class Save2{
    public int incr=10;
    synchronized public void increment2(){
        incr+=1;
        System.out.println("Incremented call=>"+incr);
    }
    synchronized public void display2(){
        System.out.println("Display=>"+incr);
    }
}
class Increment2 implements Runnable{
    Thread t;
    Save2 s;
    Increment2(Save2 ss){
        s= ss;

        t=new Thread(this);
        t.start();
    }
    @Override
    public void run(){
        s.increment2();
    }


}
class Display2 implements Runnable
{
    Thread t;
    Save2 s;
    Display2(Save2 ss)
    {
        s= ss;
        t=new Thread(this);
        t.start();
    }
    @Override
    public void run(){
        s.display2();
    }

}

class Qu_2

{
    public static void main(String[] args) {
        Save2 s = new Save2();
        new Display2(s);
        new Display2(s);
        new Increment2(s);
        new Increment2(s);
        new Display2(s);
        new Increment2(s);
        new Display2(s);
        new Increment2(s);
        new Display2(s);
        new Increment2(s);

    }
}
    