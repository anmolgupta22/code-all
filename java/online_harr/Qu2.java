package online_harr;

public class Qu2 {
    static int fact(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            return n*fact(n-1);

        }
        }


    public static void main(String[] args) {
            int x=4;
        System.out.println("The value of factorial n is ="+fact(x));

    }
}
