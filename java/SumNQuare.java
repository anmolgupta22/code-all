import java.util.Scanner;

public class SumNQuare {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int n = key.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++)

            sum += (int) (Math.pow(2 * i, 2));

        {

            System.out.println(+sum);

        }
    }
}