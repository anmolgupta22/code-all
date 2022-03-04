package BasicLabProblems;

import java.util.Scanner;

class area {
    private
    int t, t1;

    public int total1(int x, int y) {
        t = x + y;
        return t;

    }

    int total2(int k, int z) {
        t1 = k + z;
        return t1;
    }
}


public class First {
public static void main(String arg[])
{
    int x,y,z,k,m;
    Scanner key=new Scanner(System.in);
    x=key.nextInt();
    y=key.nextInt();
    z=key.nextInt();

    area a=new area();
    k=a.total1(x,y);
    m=a.total2(k,z);
    System.out.println("sum="+m);


}
}
