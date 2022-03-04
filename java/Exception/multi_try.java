package Exception;

public class multi_try {
    public static void main(String arg[]) {
        try {
          int a[] = {1, 3, 5, 6, 3};
//            System.out.println(a[5]);
            try {
                int x = a[2] / 0;
                System.out.println(x);
            }

            catch (ArithmeticException e) {
                System.out.println("division by Zero i s not possible");
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println("Elements at such index does not exists");
        }
    }
}
