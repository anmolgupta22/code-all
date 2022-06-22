package Recursion;

public class Qu2 {
    public static void main(String arg[]){
        int n=5;
        fun(n);
    }
    static void fun(int n){
        if(n==0)
            return;
        System.out.println(n);
        fun(n-1);
    }
}
