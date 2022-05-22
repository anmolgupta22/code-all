//package LinkList;
//import java.util.*;
//class Node {
//    int data;
//    Node next;
//    Node(int x){
//        data=x;
//        next =null;
//    }
//}
//
//class display{
//    static Node insertAtEnd(Node head ,int x){
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
//    static void  Middle(Node head) {
//        int count = 0;
//        int val;
//        Node cur = head;
//        Node  cuurr=head;
//        while (cur != null) {
//            count++;
//            cur = cur.next;
//        }
//        if (count % 2 == 0)
//        {
//            Node cuur = head;
//            for (int i = 1; i < count / 2; i++) {
//                cuur = cuur.next;
//            }
//            System.out.print(cuur.data + " " + cuur.next.data);
//        }
//
//         else {
//            for (int i = 0; i < count / 2; i++)
//            {
//
//                cuurr = cuurr.next;
//            }
//            System.out.print(cuurr.data);
//        }
//    }
//
//    public static void main(String[] args){
//        Scanner key=new Scanner(System.in);
//        int n=key.nextInt();
//        Node head=null;
//        for(int i=0;i<n;i++){
//            int x=key.nextInt();
//            head=insertAtEnd(head,x);
//        }
//        Middle(head);
//
//    }
//}