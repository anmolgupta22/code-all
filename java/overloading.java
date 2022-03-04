import java.util.Scanner;

public class overloading {
    public
    float t, a,h,b,c;
    public
    overloading(float x)
    {
        a=x;

    }
    overloading(float x,float y)
    {
        a=x;
        b=y;
    }

    void area_of_circle()
    {
      t  =(22*a*a)/7;
        System.out.println("Area of circle="+t);
    }
    void area_of_reactange()
    {
        t=a*b;
        System.out.println("area of reactange="+t);
    }

    void area_of_triangle()
    {
        t=(a*b)/2;
        System.out.println("area of triangle="+t);
    }
    void area_of_square()
    {
        t=(a*a);
        System.out.println("Area of Square="+t);
    }
    public static void main(String arg[])
    {
        Scanner key=new Scanner(System.in);
        System.out.print("enter x=");
        float x =key.nextInt();
        System.out.print("enter y=");
        float y= key.nextInt();
           overloading m =new overloading(x,y);
        m.area_of_circle();
        m.area_of_reactange();
        m.area_of_triangle();
        m.area_of_square();
    }
}
