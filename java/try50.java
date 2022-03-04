class BookThreadSeat
{
    int s=10;
    synchronized void bookSeat(int seats)
    {
        if(s>=seats)
        {
            System.out.println(seats+" Seats Booked successfully");
            s=s-seats;
            System.out.println("seats left:"+s);
        }
        else
            System.out.println("seats cannot be booked");
    }
}
public class try50 extends Thread {
    static BookThreadSeat b;
    int seats;
    public void run() {
        b.bookSeat(seats);
    }
    public static void main(String arg[])
    {
        b=new BookThreadSeat();
      try50 t=new try50();
      t.seats=4;
      t.start();
      try50 t1=new try50();
      t1.seats=8;
      t1.start();

    }
}
