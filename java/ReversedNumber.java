import java.util.Scanner;

public class ReversedNumber {
    public static void main(String[] args)
    {
        Scanner key=new Scanner(System.in);
        System.out.println("Enter the Numbers=");
        int n = key.nextInt();
        int temp, reverse =0;
        while(n!=0)
        {

            temp = n / 10;
            reverse = reverse * 10 + temp;

}
            System.out.println(reverse);
        }
     }




