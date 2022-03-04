package Assignment7;
class Save{
     int incr=10;
     void increment1(){
        incr++;
        System.out.println("Incremented call=>"+incr);
    }
     void display1(){

        System.out.println("Display=>"+incr);
    }
}
class Increment implements Runnable{
    Thread t;
    Save s;
    Increment(Save ss){
        s= ss;
        t=new Thread(this);
        t.start();
    }
    @Override
    public void run(){
        s.increment1();
    }
}
class Display implements Runnable
{
    Thread t;
    Save s;
    Display(Save ss)
    {
        s= ss;
        t=new Thread(this);
        t.start();
    }
    @Override
    public void run(){
        s.display1();
    }
}
public class Qu1
{
    Qu1()
    {
        System.out.println("sjfsjdjfjdnf");
    }
    public static void main(String[] args) {
        Save s = new Save();
        new Qu1();
        new Display(s);
        new Display(s);
       new Increment(s);
       new Increment(s);
       new Display(s);
        new Increment(s);
        new Display(s);
        new Increment(s);
        new Display(s);
        new Increment(s);

    }
}
    