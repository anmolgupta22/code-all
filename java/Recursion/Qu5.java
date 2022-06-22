//factorial
package Recursion;

public class Qu5 {
   static int count=0;
    public static void main(String arg[]) {
        int n=2056540403;
        System.out.println(fun(n));
    }
        static int fun(int n){
        int rem=n%10;
            if(n%10==n)
                return count;
            if(rem==0) {
                count++;
            }
            fun(n/10);
            return count;
        }



}
