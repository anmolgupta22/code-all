package String_1;

public class pan {
    public static void main(String []arg){
        String st="moom";
        StringBuilder sb=new StringBuilder(st);
        String st1 = String.valueOf(sb.reverse());
        if(st.equals(st1)){
            System.out.print("yes");
        }
        else
            System.out.print("No");
    }
}
