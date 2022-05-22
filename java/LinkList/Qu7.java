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
//    static Node reverse(Node head)
//    {
//        if(head==null || head.next==null)
//        {
//            return head;
//        }
//        Node prev=null;
//        Node curr=head;
//        while(curr!=null)
//        {
//            prev=curr.prev;
//            curr.prev=curr.next;
//            curr.next=prev;
//            curr=curr.prev;
//        }
//        return prev.prev;
//    }
//    public static void main(String arg[]){
//        Scanner key=new Scanner(System.in);
//        Node head=null;
//        for(int i=0;i<5;i++){
//            int x=key.nextInt();
//            head=insertBegin(head,x);
//        }
//        PrintList(head);
//
//        head=reverse(head);
//        PrintList(head);
//    }
//    static void PrintList(Node head){
//        Node curr=head;
//        while(curr!=null){
//            System.out.print(curr.data+" ");
//            curr=curr.next;
//
//        }
//    }
//}