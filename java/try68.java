//import java.util.*;
//
//class Node {
//    int data;
//    Node1 next;
//    Node(int x)
//    {
//        data =x;
//        next=null;
//    }
//}
//class solution{
//    Node1 LastEnd(Node1 head , int x)
//    {
//        Node1 temp =new Node1(x);
//        if(head==null) {return temp;}
//        Node1 curr=head;
//        while(curr.next!=null)
//        {
//            curr=curr.next;
//        }
//        curr.next=temp;
//        return temp;
//    }
//}
//
//    class  Display {
//
//
//        public static void main(String args[]) {
//            Scanner key = new Scanner(System.in);
//            int x = key.nextInt();
//            int t = key.nextInt();
//            while (t > 0) {
//               // int n = key.nextInt();
//                Node1 head = new Node1(key.nextInt());
//                Node1 tail = head;
//                for (int i = 1; i<t; i++) {
//                    tail.next = new Node1(key.nextInt());
//                    tail = tail.next;
//                }
//
//                solution g = new solution();
//                g.LastEnd(head, x);
//                PrintList(head);
//                System.out.println();
//                t--;
//            }
//
//        }
//        public static void PrintList(Node1 head)
//        {
//            Node1 curr = head;
//            while (curr != null)
//            {
//                System.out.print(curr.data + " ");
//                curr = curr.next;
//
//            }
//        }
//    }
//
