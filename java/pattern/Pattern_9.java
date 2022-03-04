//10.    * * * * * * * * * *
//        * * * * * * * * *
//         * * * * * * * *
//          * * * * * * *
//           * * * * * *
//            * * * * *
//             * * * *
//              * * *
//               * *
//                *

        package pattern;

import java.util.Scanner;

public class Pattern_9{
    public static void main(String arg[]){
        Scanner key=new Scanner(System.in);
        System.out.print("Enter the pattern numbers=");
        int n=key.nextInt();

        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= (2 * n) -i; j++) {
                if (j >=i && j <=(2*n)-i)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();
        }}
}

