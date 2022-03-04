//https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md

//1.      *****
//        *****
//        *****
//        *****
//        *****

package pattern;

import java.util.Scanner;

public class pattern_1
{
    public static void main(String arg[])
    {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter the pattern Numbers=");
        int n = key.nextInt();

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                System.out.print("*");

            }

            System.out.println();
        }
    }
}