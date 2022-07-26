//2.      *
//        **
//        ***
//        ****
//        *****

package pattern;

import java.util.Scanner;

public class pattern_2 {
    public static void main(String arg[])
    {
        Scanner key=new Scanner(System.in);
        int n=key.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");

            }

            System.out.println();
        }
    }
}