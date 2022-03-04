//4.      1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5

        package pattern;
import java.util.Scanner;
public class pattern_4 {
    public static void main(String arg[])
    {
        Scanner key=new Scanner(System.in);
        System.out.print("Enter the Pattern Numbers=");
        int n=key.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){

                System.out.print(j);
            }
            System.out.println();
        }
    }
}
