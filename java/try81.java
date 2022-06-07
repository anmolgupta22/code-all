import java.util.*;
class Roman
{
    public static void ToRoman(int num) {
        int[] val = {500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanLiterals = {"D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < val.length; i++) {
            while (num >= val[i]) {
                num -= val[i];
                roman.append(romanLiterals[i]);
            }
        }
        System.out.println("Roman: " + roman);
    }
    public static void main(String[] args) {
Scanner key=new Scanner(System.in);
System.out.println("Enter the number 1 to 500");
        int num= key.nextInt();
        if(num<1 || num>500 ){
            System.out.println("Please enter the value 1 to 500");
          System.exit(0);
        }
        Roman.ToRoman(num);
    }
}
