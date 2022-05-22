//package LinkList;
//import java.util.*;
//class Node {
//    int data;
//    Node next;
//    Node (int x){
//        data=x;
//        next=null;
//    }
//}
//
//class Main{
//    static Node insertAtEnd(Node head, int x,int key1){
//        Node temp=new Node(x);
//        if(head==null){
//            return temp;
//        }
//        Node curr=head;
//        while(curr.next!=null){
//            curr=curr.next;
//        }
//        curr.next=temp;
//
//       Node temp1= new Node(key1);
//        if(head==null){
//            return temp1;
//        }
//        Node curr1=head;
//        while(curr1.next!=null){
//            curr1=curr1.next;
//        }
//        curr1.next=temp;
//        return head;
//    }
//
////    static Node addAtEnd(Node head, int key1){
////        Node temp=new Node(key1);
////        if(head==null){
////            return temp;
////        }
////        Node cur=head;
////        while (cur!=null){
////            cur=cur.next;
////        }
////        cur.next=temp;
////        return head;
////    }
//
//    public static void main(String arg[]){
//        Scanner key=new Scanner(System.in);
//        int key1=key.nextInt();
//        int n=key.nextInt();
//        Node head=null;
//        for(int i=0;i<n;i++){
//            int x=key.nextInt();
//            head=insertAtEnd(head,x,key1);
//        }
//      //  addAtEnd(head, key1);
//        PrintList(head);
//
//    }
//    static void PrintList(Node head){
//        Node currr=head;
//        while(currr!=null){
//            System.out.print(currr.data+" ");
//            currr=currr.next;
//        }
//
//    }
//}