import java.util.ArrayList;
import java.util.Scanner;

public class try78 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Enter the number of  elements");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum ;
        System.out.println("Enter array elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (n % 2 == 0) {
            for (int i = 0; i < n; i += 2) {

                sum = arr[i] + arr[i + 1];
                list.add(sum);
            }
        } else {
            for (int i = 0; i < n - 1; i += 2) {

                sum = arr[i] + arr[i + 1];
                list.add(sum);
            }
            list.add(arr[n - 1]);
        }

        for (Integer integer : list) {
            System.out.print(integer + " ");

        }
    }
}




