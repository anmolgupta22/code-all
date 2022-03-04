//8.  *
//   ***
//  *****
// *******
//*********
        package pattern;

import java.util.Scanner;

public class pattern_8 {
    public static void main(String arg[]){
        Scanner key=new Scanner(System.in);
        System.out.print("Enter the pattern numbers=");
        int n=key.nextInt();

        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= (2 * n) - 1; j++) {
                if (j >= n+1-i && j <= n-1+i)
                    System.out.print("*");
                else
                   System.out.print(" ");

            }
            System.out.println();
        }}
    }

