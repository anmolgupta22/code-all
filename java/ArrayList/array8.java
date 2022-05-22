package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class array8 {
    public static void main(String arg[]){
        ArrayList<String> list=new ArrayList<>();
        list.add("red");
        list.add("black");
        list.add("pink");
        list.add("orange");

            System.out.println(list);
        Collections.sort(list);//sort array string
        System.out.println(list);

        //shuffle  array List
        Collections.shuffle(list);
        System.out.println(list);
        //reverse array List
        Collections.reverse(list);
        System.out.println(list);

       // extract a portion of a array list

        List<String> list1= list.subList(0,3);
        System.out.println(list1);


        // swap two elements in an array list
     Collections.swap(list1,0,2);
System.out.println(list1);

        // second element of a ArrayList
        String new_color="while";
list.set(1,new_color);
for(String ele:list){
    System.out.println(ele);
}

//trim the capacity of an array list
        list.trimToSize();
        System.out.println(list);
//clone arraylist
        ArrayList<String> newc1 = (ArrayList<String>)list.clone();
        System.out.println("Cloned array list: " + newc1);

    }
}
