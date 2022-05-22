//package LinkList;
//import java.util.*;
//class Node{
//    int data;
//    Node next;
//    Node(int x){
//        data=x;
//        next=null;
//    }
//}
//class dis{
//    static Node insertBegin(Node head,int x){
//        Node temp=new Node(x);
//        temp.next=head;
//        return temp;
//    }
//    static Node remove(Node head, int k){
//        Node curr=head;
//        Node cur=head;
//        Node prev=null;
//        while(cur!=null){
//            if(k==cur.data)
//            {
//
//
//        while(curr!=null && curr.data!=k){
//            prev=curr;
//            curr=curr.next;
//        }
//        if(curr==null){
//            return curr;
//        }
//        prev.next=curr.next;
//
//        return head;
//    }
//    public static void main(String arg[]){
//        Scanner key=new Scanner(System.in);
//        int n=key.nextInt();
//        Node head=null;
//        for(int i=0;i<n;i++) {
//            int x = key.nextInt();
//
//            head = insertBegin(head, x);
//        }
//        int k=key.nextInt();
//            head=remove(head,k);
//
//        PrintList(head);
//    }
//    static void PrintList(Node head){
//        Node curr=head;
//        while(curr!=null){
//            System.out.print(curr.data+" ");
//            curr=curr.next;
//        }
//    }
//}