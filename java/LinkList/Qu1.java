//package LinkList;
//import java.util.*;
//
//class Node<T>{
//    int data;
//    Node<T> next;
//    Node (int x){
//        data=x;
//        next =null;
//    }
//
//}
//
//
//class InsertBegin
//{
//    static Node insertBegin(Node head, int x) {
//        Node<T> temp = new Node<T>(x);
//        temp.next = head;
//        return temp;
//    }
//    static int temp = 0;
//
//        static Node<T> reverse(Node<T> head) {
//            Node<T> res = head;
//            while (res != null && res.next != null) {
//                if (res.data > res.next.data) {
//                    temp = res.data;
//                    res.data = res.next.data;
//                    res.next.data = temp;
//                } else {
//                    if (res.data < res.next.data) {
//                        temp = res.data;
//                        res.data = res.next.data;
//                        res.next.data = temp;
//                    }
//                }
//                res = res.next.next;
//            }
//            return res;
//        }
//
//
//        public static void main(String arg[]) {
//            Scanner key = new Scanner(System.in);
//            int n = key.nextInt();
//            Node<T> head = null;
//            for (int i = 0; i < n; i++) {
//                int x = key.nextInt();
//                head = insertBegin(head, x);
//
//            }
//            PrintList(head);
//            reverse(head);
//            PrintList(head);
//        }
//
//        public static void PrintList(Node<T> head) {
//            Node<T> curr = head;
//            while (curr != null) {
//                System.out.print(curr.data + "->");
//                curr = curr.next;
//            }
//            System.out.print("NULL");
//            System.out.println();
//        }
//
//
//    }
//
