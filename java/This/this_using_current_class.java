package This;
//2) this: to invoke current class method
class A
{
 void m()
 {
     System.out.println("hello m");
 }
 void n()
 {
     System.out.println("hello n");
this.m();
 }
}
public class this_using_current_class {
    public static void main(String arg[])
    {
A key=new A();
key.n();
    }
}
