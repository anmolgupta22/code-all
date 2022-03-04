//10.    * * * * *
//        * * * *
//         * * *
//          * *
//           *
//           *
//          * *
//         * * *
//        * * * *
//       * * * * *

package pattern;

import java.util.Scanner;

public class Pattern_12 {
    public static void main(String arg[]){
        Scanner key=new Scanner(System.in);
        System.out.print("Enter the pattern numbers=");
        int n=key.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");

            }
            for(int j=1;j<=n+1-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
