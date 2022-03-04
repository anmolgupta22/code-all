package This;
//3) this() : to invoke current class constructor

class A1
        {
         //
         A1()
         {
             System.out.println("hello A1");
         }
         A1(int x)

            {
                this();

                System.out.println(x);
            }
        }
public class this_3 {
    public static void main(String arg[])
    {
A1 key=new A1(10);

    }
}
