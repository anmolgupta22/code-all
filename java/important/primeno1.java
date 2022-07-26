package important;

public class primeno1 {
    public static void main(String[] arg) {
        System.out.print(prime(19));
    }

    static boolean prime(int n) {

        if (n == 0 || n == 1) {
            return false;
        } else {
            for (int i = 2; i < n / 2; i++) {
                if (n % i == 0) {
                    return false;

                }
            }
        }
        return true;

    }

}