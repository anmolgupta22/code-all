package String_1;

import java.util.Scanner;

class Reverse
{
    public static void reverseWord(String str)
    {
        StringBuilder sb=new StringBuilder(str);
        String s=String.valueOf(sb.reverse());
        System.out.print(s);
    }
}
public class gfg3 {
    public static void main(String []args){
        Scanner key=new Scanner(System.in);
        String s=key.nextLine();
        Reverse.reverseWord(s);
    }
}
