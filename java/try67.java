import java.util.*;
import java.io.*;
import java.text.DecimalFormat;
class ItemType
{
    public  String name;
    public  Double deposit;
    public Double costPerDay;
    DecimalFormat de=new DecimalFormat("0.0");
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getDeposit(){
        return deposit;
    }
    public void setDeposit(double deposit){
        this.deposit=deposit;
    }
    public double getCostPerDay(){
        return costPerDay;
    }
    public void setCostPerDay(double costPerDay){
        this.costPerDay=costPerDay;
    }
    void display(String name, double deposit, double costPerDay){
        System.out.println(getName());
        System.out.println(de.format(getDeposit()));
        System.out.println(de.format(getCostPerDay()));
    }
}
class Main
{
    public static void main(String []args)
    {
        Scanner key=new Scanner(System.in);
        ItemType obj=new  ItemTpye();
        obj.name=key.next();
        obj.deposit=key.nextDouble();
        obj.costPerDay=key.nextDouble();
        obj.setName(obj.name);
        obj.setDeposit(obj.deposit);
        obj.setCostPerDay(obj.costPerDay);
        obj.display(obj.name,obj.deposit,obj.costPerDay);

    }

}