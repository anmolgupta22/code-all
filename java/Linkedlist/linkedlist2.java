package Linkedlist;
import java.util.*;
public class linkedlist2 {
    public static void main(String arg[]){
    LinkedList<Integer> list =new LinkedList<Integer>();
    list.add(10);
        list.add(15);
        list.add(545);
        list.add(5552);
        Collections.reverse(list);
        System.out.println(list);
        for (Integer integer : list) System.out.println(integer);

        Iterator<Integer> it = list.descendingIterator();

        // Print list elements in reverse order
        System.out.println("Elements in Reverse Order:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }


        // Add an element at the beginning
        list.addFirst(55);

        // Add an element at the end of list
        list.addLast(85);
        System.out.println("Final linked list:" + list);


        // Add an element to front of LinkedList
        list.offerFirst(1447);
        System.out.println("Final linked list:" + list);

        // Add an element at the end of a linked list
        list.offerLast(32);
        System.out.println("Final linked list:" + list);

        LinkedList <Integer> new_l_list = new LinkedList <Integer> ();
        new_l_list.add(22);
        new_l_list.add(23);

        // Add the collection in the second position of the existing linked list
        list.addAll(1, new_l_list);

        // print the new list
        System.out.println("LinkedList:" + list);

        // Find first element of the List
        Object first_element = list.getFirst();
        System.out.println("First Element is: "+first_element);

        // Find last element of the List
        Object last_element = list.getLast();
        System.out.println("Last Element is: "+last_element);
//list.get(p) iterate
//        for(int p=0; p < list.size(); p++)
        int count=0;
        for(Integer int1: list )
        {
            count++;
            System.out.println("Element at index "+count+": "+int1);
        }

        //remove the element

    list.remove(2);
       System.out.println(list);

       list.removeFirst();
       for(Integer ele2: list)
       System.out.println(ele2);

//Empty check
       System.out.println(list.isEmpty());

       //linkedlist convert into array
        List<Integer> list11=new ArrayList<>(list);
        for(Integer int11 :list11)
            System.out.println(int11);


        // Checks whether the color "Green" exists or not.
        if (list.contains(22)) {
            System.out.println("Color Green is present in the linked list.");
        } else {
            System.out.println("Color Green is not present in the linked list.");
        }


    }

}

