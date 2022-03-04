//constructors in inheritance

package online_harr;
class base
{
base()
{
    System.out.println("This is constructors");
}
base(int x)
{
    System.out.println("I am overload constructor with value of a as:"+x);
}
}
class derived extends base

{
    derived()
    {
      //  super(1);
        System.out.println("this is deriverd constructors");
    }
    derived(int x,int y)
    {super(x);
        System.out.println("I am overload deriverd constructor with value of a as:"+y);
    }
}
class childDerived extends derived
{
    childDerived()
    {
        System.out.println("I am child Derived constructors");
    }
    childDerived(int x,int y,int z)

    { super(x,y);
        System.out.println("I am child Derived constructors"+z);
    }
}

public class Qu_6 {
    public static void main(String[] args) {
childDerived key=new childDerived(2,5,8);

    }
}
