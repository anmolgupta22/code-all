
//1^1-2^2+3^3-4^4+5^5-6^6..............user defined

import java.util.Scanner;

public class EvenSubOddSumNatural {

    public static void main(String[] args) {

        System.out.println("Print the sum of series");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int sum1 = 0;

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0) {
                sum += (int) (Math.pow(i, i));
            }
            if (i % 2 != 0) {
                sum1 += (int) (Math.pow(i, i));

            }
        }
        System.out.println(+sum1 - sum);
    }
}
