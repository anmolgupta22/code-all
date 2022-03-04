package Assignment6;
import java.util.*;
import java.lang.String;
class DONOR
{
    private
    int donor_no;
    String name;
    String blood;
    public
    void Input() {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter the Donor number=");
        donor_no = key.nextInt();
        System.out.print("Enter the name=");
        name = key.next();
        if (name.length() <= 20) {

        } else {
            System.out.println("Please enter the name less than equal 20");
            System.exit(0);
        }
        System.out.print("Enter the blood name=");
        blood = key.next();
        if (blood.length() <= 2) {

        } else {
            System.out.println("Please enter the blood group less than equal 2");
        }
    }
        void Output()
        {
            System.out.println("*************************************");
            System.out.println("Donor number="+donor_no);
            System.out.println("name="+name);
            System.out.println("blood name="+blood);
        }
    }



public class Assignment_3 {
    public static void main(String[] args) {
        DONOR key=new DONOR();
        key.Input();
        key.Output();
    }
}
