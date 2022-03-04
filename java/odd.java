import java.util.Scanner;

public class odd {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int n = key.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0)
                System.out.println(+i);

        }

    }
}
