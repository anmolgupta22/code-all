package Exception;

class agelessthan extends Exception{
        public String toString(){
            return "age not vaildate";
        }
        public String getMessage()
        {
            return "age not vaildate";
        }
}
public class throw1{
    public static void valid(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException("Person is not eligible to vote");
        }
        else
        {
            System.out.println("Person is eligible to vote");
        }
    }
    public static void main(String arg[]) throws agelessthan {
        valid(17);
        System.out.println("rest of the code...");

    }
}


