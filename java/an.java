import java.util.Scanner;

class an {
    public static void main(String arg[]) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter the First subject number: ");
        float s1 = key.nextInt();
        System.out.println("Enter the Second subject number: ");
        float s2 = key.nextInt();
        System.out.println("Enter the Third subject number: ");
        float s3 = key.nextInt();
        System.out.println("Enter the Fourth subject number: ");
        float s4 = key.nextInt();
        System.out.println("Enter the fivth subject number: ");
        float s5 = key.nextInt();
        float sum = s1 + s2 + s3 + s4 + s5;
        float percent = sum / 5;
        System.out.println("Percentage" + percent);
    }

}
