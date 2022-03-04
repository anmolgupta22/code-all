public class try31 {
    public static void main(String args[]) {
        try {
            int a = args.length;
            System.out.println("a=" + a);
            int b = 42 / a;
            int c[] = {1, 2, 3};
            c[62] = 99;
            String s = null;
            System.out.println("string length " + s.length());
            int i = Integer.parseInt(s);

        } catch (ArithmeticException e) {
            System.out.println("Divide by 0:" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index oob:" + e);
        } catch (NullPointerException e) {
            System.out.println("Null Pointer exception " + e);
        } catch (NumberFormatException e) {
            System.out.println("Null Pointer exception " + e);
        }
        System.out.println("After try/catch blocks.");
        int b = 10;
        int c = 20;
        int f = b + c;
        System.out.println("Sum=" + f);
    }
}
