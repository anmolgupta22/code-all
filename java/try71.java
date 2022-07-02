//import java.util.*;
//class LinkedList
//{
//    Node head;
//    static class Node
//    {
//        int data;
//        Node next;
//        public Node(int data)
//        {
//            this.data=data;
//            this.next=null;
//        }
//    }
//    public LinkedList append(int data)
//    {
//        Node newnode=new Node(data);
//        Node temp=list.head;
//        if(list.head==null)
//        {
//            list.head=newnode;
//            newnode.next=list.head;
//        }
//        else
//        {
//            while(temp.next!=list.head)
//                temp=temp.next;
//            temp.next=newnode;
//            newnode.next=list.head;
//        }
//        return list;
//    }
//    public void display(LinkedList list)
//    {
//        Node temp=list.head;
//        int r=1;
//        while(temp!=list.head||r==1)
//        {
//            r=0;
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//        }
//    }
//}
//class try71
//{
//    public static void main(String args[])
//    {
//        Scanner sc=new Scanner(System.in);
//        LinkedList list=new LinkedList();
//        int data;
//        int choice;
//        do
//        {
//            data=sc.nextInt();
//            choice=sc.nextInt();
//            if(choice==1)
//            {
//                if(data>=0)
//                    list=list.append(data);
//            }
//            else
//            {
//                list=list.append(data);
//                break;
//            }
//        }while(data>=0);
//        list.display(list);
//    }
//}