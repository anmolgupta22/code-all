package Exception;
import java.util.Scanner;
import java.lang.*;
public class multi_catch {
    public static <Arthmatic> void main(String[] args) {
        int [] marks=new int[3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;
        Scanner key=new Scanner(System.in);
        System.out.println("Enter the array index");
        int a=key.nextInt();
        System.out.println("Enter the number  you want to divide the value with");
        int number =key.nextInt();
        try {
            System.out.println("The value at array index entered is:"+marks[a]);
            System.out.println("The value of array-value/number is:"+marks[a]/number);
        }
        catch(ArithmeticException e)
        {
            System.out.println("AirthmatchExpxeption occured!");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException occured!");
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println("other execption occured!");
            System.out.println(e);
        }



    }
}
