//package LinkList;
//import java.util.*;
//class Node {
//    int data;
//    Node next;
//    Node(int x){
//        data=x;
//        next=null;
//    }
//}
//class display
//{
//    static Node insertBegin(Node head ,int x)
//    {
//        Node temp =new Node(x);
//        temp.next=head;
//        return temp;
//    }
//
//    static Node insertAtEnd(Node head1,int x)
//    {
//        Node temp=new Node(x);
//        if(head1==null){
//            return head1;
//        }
//        Node curr=head1;
//        while(curr!=null){
//            curr=curr.next;
//        }
//        curr.next=temp;
//        return head1;
//    }
//    public static void main(String arg[]){
//        Scanner key=new Scanner(System.in);
//        Node head=null;
//        Node head1=null;
//        for(int i=0;i<5;i++){
//            int x=key.nextInt();
//            head=insertBegin(head,x);
//            head1=insertAtEnd(head,x);
//        }
//        PrintList(head);
//        PrintList1(head1);
//    }
//    static void PrintList(Node head){
//        Node curr=head;
//        while(curr!=null){
//            System.out.print(curr.data+" ");
//            curr=curr.next;
//
//        }
//    }
//    static void PrintList1(Node head1){
//        Node curr=head1;
//        while(curr!=null){
//            System.out.print(curr.data+" ");
//            curr=curr.next;
//        }
//    }
//}