import java.util.Scanner;
class number1
{ void number(int length,int n)
    {for (int i = 1; i <= length; i++)
        {int num = n%10;
                if (num == 1) {
                    System.out.println("One");
                } else if (num == 2) {
                    System.out.println("Two");
                } else if (num == 3) {
                    System.out.println("three");
                } else if (num == 4) {
                    System.out.println("Four");
                } else if (num == 5) {
                    System.out.println("Five");
                } else if (num == 6) {
                    System.out.println("Six");
                } else if (num == 7) {
                    System.out.println("Seven");
                } else if (num == 8) {
                    System.out.println("Eight");
                } else if (num == 9) {
                    System.out.println("Nine");
                }
                else if(num==0) {
                    System.out.println("Zero");
                }
                n = n /10;
            }
        }
    }
       public  class try41 {
            public static void main(String[] args) {
                Scanner key = new Scanner(System.in);
                int n = key.nextInt();
                int[] array = new int[n];
                int length1 = array.length;
                int length = String.valueOf(length1).length();
                System.out.println(length);
                number1 key1 = new number1();
               key1.number(length ,n);
            }
            }



