import java.util.Scanner;
public class try47 {
    public static void main(String arg[])
    {
       Scanner key=new Scanner(System.in);
        System.out.println("Enter the value of speed");
        int speed=key.nextInt();
        if(speed<70)
        {
            System.out.println("ok");
        }
        else
        {
            int speed1=(speed-70)/5;
            if (speed1<=12)
            {
                System.out.println("point:"+speed1);
            }
            else
            {
                System.out.println("License suspended");
            }
        }
    }
}
