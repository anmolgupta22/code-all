package Assignment6;
import java.util.*;
import java.lang.String;
class employee {
    int empno;
   String ename;
    float basic, hra, da, netpay;
    Scanner key = new Scanner(System.in);

    void havedata() {
        System.out.print("Enter the employee id=");
        empno = key.nextInt();
        System.out.print("Enter the employee name=");
        ename = key.next();
        System.out.print("Enter the basic salary=");
        basic = key.nextFloat();
        System.out.print("Enter the hra=");
        hra = key.nextFloat();
        System.out.print("Enter the da=");
        da = key.nextFloat();


    }

    float calculate() {

        return basic - hra - da;

    }

    void disdata() {
        System.out.println("*************************************************");
        System.out.println("Employee id="+empno);

        System.out.println("employee name="+ename);

        System.out.println("basic salary="+basic);

        System.out.println("hra="+hra);

        System.out.println("da="+da);
        System.out.println("Total Netpay="+calculate());




    }

}
public class Assignment_1
{

        public static void main(String[] args) {
            employee key1 = new employee();
            key1.havedata();
            float pay =key1.calculate();
            System.out.println("Netpay salary="+pay);
            key1.disdata();


        }
    }

