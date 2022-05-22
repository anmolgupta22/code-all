//package LinkList;
//import java.util.Scanner;
//
//class Node{
//    int data;
//    Node next;
//    Node (int x){
//        data=x;
//        next=null;
//    }
//}
// class Single_Insertion {
//    static Node insertBegin(Node head , int x){
//        Node temp= new Node(x);
//        temp.next=head;
//        return head;
//    }
//    public static void main (String args[]){
//        Node head =null;
//       // head.next=new Node(20);
//
//        Scanner key=new Scanner(System.in);
//        int t=key.nextInt();
//        while(t>0)
//        {
//            int n=key.nextInt();
//
//            for(int i=0;i<n;i++) {
//                int x=key.nextInt();
//                head =insertBegin(head, x);
//            }
//            PrintList(head);
//            t--;
//        }
//    }
//    public static void PrintList(Node head){
//        Node curr=head;
//        while(curr!=null){
//            System.out.print(curr.data+" ");
//            curr=curr.next;
//        }
//    }
//
//}
