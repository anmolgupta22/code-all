package ArrayList;
import java.util.*;
public class array5 {
    public static void main (String arg[])
    {
        ArrayList<String> list=new ArrayList<>();
        list.add("Aman");
        list.add("anmol");
        list.add("utkarsh");
        list.add("ansh");
        for(String ele:list)
        System.out.println(ele);
        String ele1=list.get(0);
        System.out.println(ele1);
        System.out.println(list.get(3));
    }
}
