package JavaTranning;

import java.util.StringTokenizer;

public class string_tokenizer_Q12 {
    public static void main(String[] args) {
        StringTokenizer st=new StringTokenizer("Let,s,try,this",",");
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
    }
}
