package JavaTranning;
import java.util.Scanner;

public class nov_08_Qu2 {
    public static void main(String[] args) {
        Scanner key= new Scanner(System.in);
        Integer i=key.nextInt();
        key.close();
        int value =i.hashCode();
        System.out.println(" "+value);

    }
}
