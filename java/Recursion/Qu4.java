package Recursion;

public class Qu4 {
    public static void main(String arg[]){
        int n=1342;
        int num = 0;

        while(n>0) {
            num+= n % 10;

            n = n / 10;
        }

        System.out.println(num);
    }

}
