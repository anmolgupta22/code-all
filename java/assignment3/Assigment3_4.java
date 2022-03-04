//4. The policy followed by a company to process customer orders is given by the following rules:
//        (a) If a customer order is less than or equal to that in stock and has credit is OK, supply has requirement.
//        (b) If has credit is not OK do not supply. Send him intimation.
//        (c) If has credit is Ok but the item in stock is less than has order, supply what is in stock. Intimate to him data the balance will be shipped.
//        Write a C program to implement the company policy.

package assignment3;

import java.util.Scanner;

public class Assigment3_4 {
    public static void main(String arg[]) {


        int stock = 100;
        int  credit;
        Scanner key = new Scanner(System.in);
        System.out.print("Enter the customer order=");
        int order = key.nextInt();
        System.out.print("credit confirmed press 1 and credit not confirmed press 2=");
        int b=key.nextInt();

        if(order<stock && b==1){
            System.out.print("supply has requirement="+order);
        }
        else if (order>stock && b==1){
            System.out.println("We supplied products and balance will be shipped later="+stock);
        }
        else
        {
            System.out.println("Please first clear your credit, until we can't supply you any more.");

        }
    }
}
