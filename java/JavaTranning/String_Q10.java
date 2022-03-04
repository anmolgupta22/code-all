package JavaTranning;

import java.util.Scanner;

public class String_Q10 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("");
        Scanner sc=new Scanner(System.in);
        sb.append(sc.nextLine());
        int index= sc.nextInt();
        char ch=sc.next().charAt(0);
        sb.setCharAt(index,ch);
        System.out.println(sb);
    }
}
