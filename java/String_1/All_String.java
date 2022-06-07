package String_1;

import java.lang.String;
public class All_String {
    public static void main(String arg[]) {
        String st="hello world";
//        System.out.println(st.length());
//        System.out.println(st.toLowerCase());
//        System.out.println(st.toUpperCase());
//        System.out.println(st.trim());
//        System.out.println(st.substring(1));
//        System.out.println(st.substring(0,5));
//        System.out.println(st.replace('o','p'));
//        System.out.println(st.startsWith("hell"));
//        System.out.println(st.endsWith("ld"));
//        System.out.println(st.charAt(2));
        System.out.println(st.indexOf("wor"));
//        System.out.println(st.indexOf("o",7));
//        System.out.println(st.lastIndexOf("o"));
//        System.out.println(st.lastIndexOf("r",5));
//        System.out.println(st.equals("Hello World"));

        String s="1hello3";
        int sum=0;
        for(int i=0;i<s.length();i++){
if((s.charAt(i)<='0') || (s.charAt(i)>='0')){
 sum+=s.charAt(i);
}
        }

    }


    }

