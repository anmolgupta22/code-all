package project;
import java.util.Scanner;
public class average {
    public static void main(String[] args) {
        Scanner key= new Scanner(System.in);
        System.out.print("how many numbers find the average =");
        int avg =key.nextInt();
        float item, f=0;
        for(int i=1;i<=avg;i++) {
            System.out.print("item " + i + "                            :");
            item = key.nextFloat();

           f= item+f;
        }
        f=f/avg;
        System.out.println("Average                           ="+f);

    }
}
