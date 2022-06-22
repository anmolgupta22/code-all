//factorial
package Recursion;

public class Qu3 {
    public static void main(String arg[]){
        int n=5;
        int sum=   fun(n);
        System.out.println(sum);
    }
    static int  fun(int n) {
        if (n == 1)
            return 1;
        return n* fun( n - 1);
    }

}
