package Exception;

public class Qu_1 {
    public static void main(String[] args) {
        try
        {
            int data =100/0;
            System.out.println("anmol"+data);
        }
        catch (Exception e)
        {
            System.out.println("We are not divided");
            System.out.println(e);
            //rest code of the program
            System.out.println("rest the code......");
        }
    }
}
