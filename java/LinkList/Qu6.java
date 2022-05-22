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
//class display {
//    static Node insertAtEnd(Node head, int x) {
//        Node temp = new Node(x);
//        if (head == null) {
//            return temp;
//        }
//        Node curr = head;
//        while (curr.next != null) {
//            curr = curr.next;
//        }
//        curr.next = temp;
//
//        return head;
//    }
//
//    static Node Swap(Node head)
//    {
//        Node res = head;
//        Node temp=null;
//        while(res!=null && res.next!=null){
//
//            res=res.next;
//        }
//        temp=head;
//        head=res;
//        head=temp;
//
//        while (curr!=null){
//              cur
//            curr=curr.next;
//        }
//
//
//return head;
//    }
//
//
//
//    public static void main(String arg[]){
//        Scanner key=new Scanner(System.in);
//        int n=key.nextInt();
//        Node head=null;
//        for(int i=0;i<n;i++){
//            int x=key.nextInt();
//            head=insertAtEnd(head,x);
//        }
//        PrintList(head);
//        head=Swap(head);
//        PrintList1(head);
//
//    }
//    static void PrintList(Node head){
//        Node curr=head;
//        System.out.print("Before Swap :");
//        while(curr!=null){
//            System.out.print(" "+curr.data);
//            curr=curr.next;
//        }
//        System.out.println();
//    }
//
//    static void PrintList1(Node head){
//        Node currr=head;
//        System.out.print("After Swap :");
//        while(currr!=null){
//            System.out.print(" "+currr.data);
//            currr=currr.next;
//        }
//    }
//}