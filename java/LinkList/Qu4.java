//package LinkList;
//import java.util.*;
//import java.io.*;
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
//
//    static Node insertAtEnd(Node head,int x)
//    {
//        Node temp=new Node(x);
//        if(head==null){
//            return temp;
//        }
//        Node curr=head;
//        while(curr.next!=null){
//            curr=curr.next;
//        }
//        curr.next=temp;
//        return head;
//    }
//
//    static Node insertAtBegin(Node head1 ,int x){
//        Node temp=new Node(x);
//        temp.next=head1;
//        return temp;
//    }
//
//    public static void main(String arg[]){
//        Scanner key=new Scanner(System.in);
//        int n=key.nextInt();
//        Node head=null;
//        Node head1=null;
//        for(int i=0;i<n;i++){
//            int x=key.nextInt();
//            head1=insertAtBegin(head1,x);
//            head=insertAtEnd(head,x);
//        }
//        Print(head1);
//        PrintList(head);
//
//
//    }
//    static void PrintList(Node head){
//        Node cur=head;
//        while(cur!=null){
//            System.out.print(cur.data+"  ");
//            cur=cur.next;
//        }
//
//    }
//    static void Print(Node head1){
//        Node cur=head1;
//        while(cur!=null){
//            System.out.print(cur.data+"  ");
//            cur=cur.next;
//        }
//        System.out.println();
//    }
//
//}