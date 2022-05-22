package ArrayList;
import java.util.ArrayList;
public class array7 {
    public static void main(String arg[]){
        ArrayList<String> list=new ArrayList<>();
        list.add("red");
        list.add("pink");
        list.add("Black");
        list.add("white");
        for(String ele:list)
            System.out.println(list);
       if( list.contains("aman"))//check available or not
       {
           System.out.println("available");
       }
else{
    System.out.println("Not available");
       }
    }
}
