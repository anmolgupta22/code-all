package ArrayList;

import java.util.ArrayList;

public class array6 {
    public static void main(String arg[]){
        ArrayList<String> list=new ArrayList<>();
        list.add("Aman");
        list.add("anmol");
        list.add("utkarsh");
        list.add("ansh");

        list.set(2,"chirag");//change postion name from the list
        for(String ele:list)
            System.out.println(ele);

    }
}
