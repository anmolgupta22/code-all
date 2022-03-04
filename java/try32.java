//class student
//{
//    //instance variable
//    int roll;
//    String name;
//    static String college="VIT";// static variable
//    student (int r,String n)
//    {
//        roll=r;
//        name=n;
//        System.out.println("information= "+roll+" "+name +" "+college);
//    }
//}
//
//class A2{
//    static {System.out.println("static block is invoked");}
//    public static void main(String args[]){
//        System.out.println("Hello main");
//    }
//}
import java.lang.ClassNotFoundException;
class try32{
    static{
        System.out.println("static block is invoked");
        System.exit(0);
    }
}
//public class try32 {
//    public static void main(String[] args) {
//        student key=new student(45,"Anmol");
//        student key2=new student(58,"gupta");
////key,key2 is static memory
//        //45,anmol,58,gupta heap memory
//    }
