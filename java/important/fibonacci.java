package important;

public class fibonacci {
    public static void main(String [] arg){
        fibo( 10);
    }
    static void fibo(int n){
        int a=0,b=1,c;
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
