package String_1;
import java.util.Scanner;

public class gfg1 {
    public static void main(String arg[]){
        Scanner key=new Scanner(System.in);
        String str ="Anmolgupta";
    int [] count=new int [26];
    for(int i=0;i<str.length();i++){
        count[str.charAt(i)-'a']++;
        for(int j=0;j<26;j++){
            if(count[j]>0){
                System.out.println((char)(i+'a')+" "+count[i]);
            }
        }
    }

    }
}
