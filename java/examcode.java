public class examcode {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 13;
        System.out.println("The 1st number is:" + Mystery(num1, 6));
        System.out.println("The 2nd number is:" + Mystery(num2 % 5, 1 + num1 * 2));
    }
    private static int Mystery(int num1,int num2)
    {
        num1=Unknown(num1, num2);
        num2=Unknown(num2,num1);
        return (num2);

    }
    private static int Unknown(int num1,int num2)
    {
        int num3 =num1+num2;
        num2+=num3*2;
        return num2;
    }
}
