//package LinkList;
//import java.util.*;
//
//class Node{
//    int data;
//    Node next;
//    Node(int x){
//        data=x;
//        next=null;
//    }
//}
//
//class dis{
//    static Node insertAtEnd(Node head){
//        Node temp=new Node(x);
//        if(head==null)
//        {
//            return temp;
//        }
//
//        Node curr=head;
//        while(curr!=null){
//            curr=curr.next;
//        }
//        temp.next=head;
//        return head;
//    }
//    static Node Middle(Node head,int x){
//        Node temp=new temp(x);
//        if(head==null){
//            return temp;
//        }
//        Node slow=head,fast=head;
//        while(slow.next!=null && fast.next.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//        }
//        temp.next=slow.next;
//        slow.next=temp;
//        return head;
//
//    }
//    public static void main(String arg[]){
//        Scanner key=new Scanner(System.in);
//        int x=key.nextInt();
//        Node head=new Node(6);
//        head.next=new Node(7);
//        head.next.next=new Node(8);
//        head.next.next.next=new Node(9);
//        PrintList(head);
//        head=Middle(head,x);
//        PrintList(head);
//    }
//
//    static void PrintList(Node head) {
//
//
//        Node curr = head;
//        while (curr != null) {
//            System.out.print(curr.data);
//            curr = curr.next;
//        }
//    }
//
//}