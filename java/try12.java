import java.util.Scanner;

class try12{
    public static void main(String arg[]){
        int num, temp, count=0;
        Scanner key=new Scanner(System.in);
        System.out.println("Enter the Number=");
        num= key.nextInt();
        temp=num;
        while (temp != 0)
        {
            if (temp % 10 == 1)
                count++;
            temp = temp / 10;
        }
        System.out.println("The numbers of one="+count);
    }

}