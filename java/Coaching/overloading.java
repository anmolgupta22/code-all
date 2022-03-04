package Coaching;

public class overloading {
    static int  add(int a)
    {
       return a+10;
    }
    static int  add(int a,int b)
    {
       return a+b;
    }
    static int add(int a,int b,int c)
    {
        int x,y,z;
        x=a; y=b;z=c;
        x++;
        y++;
        z++;
        return x+y+z;
    }

    public static void main(String[] args) {
        int a,b,c;
        a=12;b=32;c=12;
     int d=  add(a,b,c);
        System.out.println(d);
    }

}
