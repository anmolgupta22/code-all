package Lab_problems;

class account
{
    String name,address,type;
    int accno,bal;
    account(String n,int no,int b)
    { name=n; accno=no; bal=b; }
    account(String n,int no,String addr,String t,int b)
    {
        name=n; accno=no;
        address=addr;
        type=t; bal=b;
    }
    void deposite(int a) { bal+=a; }
    void withdraw(int a) { bal-=a; }
    int getbalance() { return(bal); }
    void show()
    {

        System.out.println(" ACCOUNT DETAILS");
        System.out.println("------------------------");
        System.out.println("Name : "+name);
        System.out.println("Account No : "+accno);
        System.out.println("Address : "+address);
        System.out.println("Type : "+type);
        System.out.println("Balance : "+bal);

    }
}
class Qu_3
{
    public static void main(String arg[])throws Exception
    {
        account a1=new account("Anmol",786,10000);
        account a2=new account("Anmol",106,"kanpur","Current account",400);
        a1.address="Calicut";
        a1.type="fixed deposite";
        a1.deposite(400);
        a2.withdraw(350);
        a2.deposite(a2.getbalance());
        a1.show();
        a2.show();
    }
}