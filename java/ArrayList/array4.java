package ArrayList;

import java.util.ArrayList;


public class array4 {
    public static void main(String arg[]){
        ArrayList<String> list=new ArrayList<>();
        list.add("red");
        list.add("pink");
        list.add("black");
        list.add("green");
        for(String ele:list)
            System.out.println(ele);
        list.add(0,"yellow");
        System.out.println(list);
        list.add(4,"orange");
        System.out.println(list);
    }
}
