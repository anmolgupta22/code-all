package JavaTranning;

import java.util.StringTokenizer;

public class string_tokenizer_q13 {
    public static void main(String[] args) {
        StringTokenizer st=new StringTokenizer("JAVA:CODE:STRING",":",true);
        while(st.hasMoreTokens())
            System.out.println(st.nextToken());
    }
}
