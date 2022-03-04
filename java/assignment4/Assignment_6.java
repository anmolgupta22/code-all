package assignment4;

import java.util.Scanner;

class named {

    public void Account_name(String s1, String s2, String s3, int s4) {

        System.out.println("Account name=" + s1);
        System.out.println("owner=" + s2);
        System.out.println("Account type=" + s3);
        System.out.println("balance=" + s4);
        System.out.println("*****************************************************");
    }

    void Current(int s4) {
        System.out.println("Current Balance=" + s4);
        System.out.println("*****************************************************");
    }

    void Account(String s1, String s2, String s3) {

        System.out.println("Account name=" + s1);
        System.out.println("owner=" + s2);
        System.out.println("Account type=" + s3);
    }
void Withdrawing(int s4)
{
    Scanner key=new Scanner(System.in);
    System.out.print("Withdrawing Money request=");
    int b= key.nextInt();
    if(b<=s4)
    {
        System.out.println("Money Withdraw="+b);
        System.out.println("current Balance="+(s4-b));
    }
    else {
        System.out.println("Withdraw Amount high");
    }
}

void deposit(int s4)
{
    Scanner key=new Scanner(System.in);
    System.out.print("Deposit Money=");
    int c= key.nextInt();
    int d=s4+c;
    System.out.println("Current Balance="+d);

}
}
public class Assignment_6 {
    public static void main(String arg[]) {

        Scanner key = new Scanner(System.in);
        System.out.print("Account name=");
        String s1 = key.nextLine();
        System.out.print("owner=");
        String s2 = key.nextLine();
        System.out.print("Account type=");
        String s3 = key.nextLine();
        System.out.print("Balance=");
        int s4 = key.nextInt();

        named n = new named();
        n.Account_name(s1, s2, s3, s4);
        n.Current(s4);
        n.Account(s1, s2, s3);
        n.Withdrawing(s4);
        n.deposit(s4);
    }
}