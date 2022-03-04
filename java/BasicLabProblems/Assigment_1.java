package BasicLabProblems;

import java.util.Scanner;

class rectangle
{
    private
    int t,t1;
    public

        int area_of_rectangle(int x,int y)
    {
        t=x*y;
        return t;
    }

}

public class Assigment_1 {
    public static void main(String arg[]){
        Scanner key=new Scanner(System.in);
        int x,y,z;
        System.out.print("Enter the length=");
        x=key.nextInt();
        System.out.print("Enter the Width=");
        y=key.nextInt();
        rectangle r=new rectangle();
        z=r.area_of_rectangle(x,y);
        System.out.println("Area of the rectangle="+z);

    }

}
