package Assignment6;

import java.util.*;
import java.lang.String;

class Flight
{
    private
    int flight_no;
    String Destination;
    float Distance;
    float fuel;
    void CALFUEL(){
        System.out.print("Fuel uses        =");
        if(Distance<=1000)
        {
            System.out.println("500 L");
        }
        else if (Distance>1000 && Distance<=2000)
        {
            System.out.println("1100 L");
        }
        else
            System.out.println("2200 L");
    }
    public
    void FEEINFO()
    {
        Scanner key=new Scanner(System.in);
        System.out.print("Enter the flight number=");
        flight_no=key.nextInt();
        System.out.print("Enter the Destination=");
        Destination=key.next();
        System.out.print("Enter the distance=");
        Distance=key.nextFloat();
        CALFUEL();
    }
    void SHOWINFO()
    {
        System.out.println("Flight Number="+flight_no);
        System.out.println("Destination="+Destination);
        System.out.println("Distance="+Distance);
        CALFUEL();
    }

}

public class Assignment_5 {
    public static void main(String[] args) {
        Flight key=new Flight();
        key.FEEINFO();
        key.SHOWINFO();

    }

}
