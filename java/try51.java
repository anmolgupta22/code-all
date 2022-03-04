class A
{
    public A(String s)
    {
        System.out.println("A");
    }
}
public class try51 extends A

{
    public try51(String s)
    {
        super(s);
        System.out.println("B");
    }
    public static void main(String arg[])
    {
        new try51("c");
        System.out.println(" ");
//        String str ="java programming";
//        String str1="java";
//        String str2=str.substring(5);
//        System.out.println(str2);
//        System.out.println(str.substring(5,9));

//        System.out.println(str.compareTo(str1));
//        System.out.println(str1.compareTo(str));
    }
}