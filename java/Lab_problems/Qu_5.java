package Lab_problems;
abstract class Reservation
{
    abstract void Reserve();

}
 class ReserveTrain extends Reservation
{
    public void Reserve()
    {
        System.out.println("Reserve train ");
    }
}
 class ReserveBus extends Reservation
{
    public void Reserve()
    {
        System.out.println(" Reserve bus ");
    }
}

public class  Qu_5
{

        public static void main (String[] args)
        {

        ReserveTrain rt = new ReserveTrain();
        rt.Reserve();
        ReserveBus rb = new ReserveBus();
        rb.Reserve();

    }




}