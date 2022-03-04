import java.util.Scanner;

public class try6 {
    private
    int t, a, b;

    public try6(int x, int y) {
        a = x;
        b = y;
    }
    void sum()

    {
        t=a+b;
        System.out.println("sum="+t);
    }
    void sub()
    {
        t=a-b;
        System.out.println("sub="+t);
    }
    void mul()
    {
        t=a*b;
        System.out.println("mul="+t);
    }
    void div()
    {
       t=a/b;
        System.out.println("div="+t);
    }


public static void main(String arg[])
{
    Scanner key=new Scanner(System.in);

}}
