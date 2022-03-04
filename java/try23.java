import java.lang.*;
import java.util.*;

class Foodcorporation
{

    double base_pay;
    int hours;

    void cal( double d ,int h)

    { int count,c;



        if(d<80)
        {
            System.out.println("Base pay cant be below RS 80");

            System.exit(1);

        }
        else if(h>60)
        {

            System.out.println("Hour cannot be over 60 ");

            System.exit(1);
        }
        this.base_pay=d;
        this.hours=h;

        if(hours>40)

        {
            int g= hours-40;
            double fg=(base_pay*1.5)*g;

            double k=base_pay*40;
            double sal=k+fg;
            System.out.println("Salary RS: "+sal);
        }

        else{
            double sal2=(hours*base_pay);
            System.out.println("Salary RS: "+sal2);
        }
    }
}

class try23
{

    public static void main(String []aggs)
    {
        double rt;
        int w;
        Scanner sc=new Scanner(System.in);

        Foodcorporation f1=new Foodcorporation();
        System.out.println("Enter the Base salary");
        rt=sc.nextDouble();
        System.out.println("Enter the hours");
        w=sc.nextInt();
        f1.cal(rt,w);


    }
}

