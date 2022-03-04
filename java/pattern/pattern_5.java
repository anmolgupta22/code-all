//5.      *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
     //   *

package pattern;

import java.util.Scanner;
public class pattern_5 {
    public static void main(String  arg[]){
        Scanner key=new Scanner(System.in);
        System.out.print("Enter The Pattern Numbers=");
        int n= key.nextInt();
        for(int i=0;i<=2*n;i++){
            int Total =i>n ? (2*n)-i:i;
            for(int j=0;j<Total;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n+1-i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//    }
}}
