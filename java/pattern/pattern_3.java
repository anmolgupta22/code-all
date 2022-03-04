//3.      *****
//        ****
//        ***
//        **
//        *

package pattern;

import java.util.Scanner;

public class pattern_3 {
    public static void main(String arg[])
    {
        Scanner key=new Scanner(System.in);
        System.out.print("Enter the pattern Numbers=");
        int n=key.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print("*");

            }

            System.out.println();
        }
    }
}
