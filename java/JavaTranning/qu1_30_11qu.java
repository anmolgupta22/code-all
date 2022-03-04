package JavaTranning;
import java.util.Scanner;
public class qu1_30_11qu
{

    public static void main(String arg[])
    {
        int arr[] = new int[15];
        Scanner key = new Scanner(System.in);
        int n = key.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = key.nextInt();
        }
        int max = 0;
        for(int i=0;i<n;i++)
        {
        if (arr[i] > max)
        {
            max = arr[i];
        }
    }
        System.out.println(max);
}
}
