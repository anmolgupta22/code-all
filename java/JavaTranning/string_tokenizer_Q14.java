package JavaTranning;

import java.util.StringTokenizer;

public class string_tokenizer_Q14 {
    public static void main(String[] args) {
        StringTokenizer st=new StringTokenizer("JAVA:CODE:STRING",":");
        while(st.hasMoreTokens())
            System.out.println(st.nextToken());
    }
}
