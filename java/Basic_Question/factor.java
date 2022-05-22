package Basic_Question;

import java.util.Scanner;

public class factor {
    static void fac(int n){
        int sum=1;
        while(n>0){
            sum=sum*n;
            n--;
        }
        System.out.println(sum);

    }
    public static void main(String arg[]){
        Scanner key=new Scanner(System.in);
        int n=key.nextInt();
        fac(n);

    }
}
