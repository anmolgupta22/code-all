import java.io.*;
import java.util.*;

public class try60 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        char ch[]=A.toCharArray();
        String B="";
        for(int i=ch.length-1;i>=0;i--){
            B+=ch[i];
        }
        if(A==B)
        {
            System.out.println("Yes");
        }
        else
            System.out.println("No");

    }
}



