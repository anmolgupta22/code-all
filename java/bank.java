//package t1
//import java.util.*;
//public class bank {
//
//
//    String name;
//    float bal;
//    String ac_type;
//
//    void take_user() {
//        Scanner key = new Scanner(System.in);
//        System.out.println("Enter the  name=");
//        name = key.nextLine();
//        System.out.println("Enter the Balance=");
//        bal = key.nextInt();
//        System.out.println("Enter the Account type=");
//        ac_type = key.nextLine();
//    }
//    void display()
//    {
//        System.out.println("name"+name);
//        System.out.println("Balance="+bal);
//        System.out.println("Account type="+ac_type);
//    }
//
//}
//class loan extends bank
//{
//int loan1;
//int emi;
//int total;
//void type_of_loan()
//{
//    take_user();
//    display();
//    Scanner key=new Scanner(System.in);
//    System.out.println("Enter the amount take loan=");
//    loan1=key.nextInt();
//    if(loan1>100000)
//    {
//        System.out.println("your loan amount more than 1 lakh=");
//        emi=(loan1*10)/100;
//        total=loan1+emi;
//    }
//    else
//    {
//        System.out.println("your loan amount less then 1 lakh="+loan1);
//    }
//}
//}
//
//
//
//
