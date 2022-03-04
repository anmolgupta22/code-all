package Exception;

// Java program that demonstrates the use of throw
class ThrowExcep
{
    static void fun()
    {
        try
        {
            System.out.println("hello");
            throw new ArithmeticException("demo");
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught inside fun().");
            throw e; // rethrowing the exception
        }
    }

    public static void main(String args[])
    {
        try
        {
            fun();
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught in main.");
        }
    }
}
