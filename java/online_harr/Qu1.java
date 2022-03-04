package online_harr;

public class Qu1 {
    static int sum(int ...arr){//varargs
        int result=0;
        for(int a: arr)
        {
            result+=a;
        }
        return result;
    }

    public static void main(String[] args)
    {
        System.out.println("welcome");
        System.out.println(+sum(4,5));
        System.out.println(+sum(4,6,5));
        System.out.println(+sum(2,7,2,8));
    }
}
