package Lab_problems;

import java.util .*;
interface Interest{
    void inter();

}
class In implements Interest{
    public void inter()
    {
        double pr, rate, t, s,c;
        Scanner sc=new Scanner (System. in);
        System.out.println("Enter the amount:");
        pr=sc.nextDouble();
        System. out. println("Enter the No.of years:");
        t=sc.nextDouble();
        System. out. println("Enter the Rate of  interest");
        rate=sc.nextDouble();
        s=(pr * t * rate)/100;
        c=pr * Math.pow(1.0+rate/100.0,t) - pr;
        System.out.println("Simple Interest="+s);
        System.out. println("Compound Interest="+c);
    }
    
}
public class Qu_6 {


    public static void main(String argu[]) {
        In key = new In();
        key.inter();
    }
}
