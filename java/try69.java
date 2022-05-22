//// { Driver Code Starts
//import java.util.*;
//import java.lang.*;
//
//class Node
//{
//    int data;
//    Node1 next;
//    Node(int key)
//    {
//        data = key;
//        next = null;
//    }
//}
//
//
//class try69
//{
//    static Node1 head;
//    public static void main (String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//
//        while(t-- > 0)
//        {
//            int n = sc.nextInt();
//            int k = sc.nextInt();
//
//            int a1 = sc.nextInt();
//            Node1 head = new Node1(a1);
//            addToTheLast(head);
//            for(int i = 1; i < n; i++)
//            {
//                int a = sc.nextInt();
//                addToTheLast(new Node1(a));
//            }
//
//            GfG gfg = new GfG();
//            System.out.println(gfg.getNth(head, k));
//        }
//    }
//
//    public static void addToTheLast(Node1 node)
//    {
//        if(head == null)
//        {
//            head = node;
//        }
//        else
//        {
//            Node1 temp = head;
//            while(temp.next != null)
//                temp = temp.next;
//            temp.next = node;
//        }
//    }
//}
//// } Driver Code Ends
//
//
///*node class of the linked list
//class Node
//{
//    int data;
//    Node next;
//    Node(int key)
//    {
//        data = key;
//        next = null;
//    }
//}
//*/
//class GfG1
//{
//
//    public static int getNth(Node1 node, int ind)
//    {
//        //Your code here
//        int count =1;
//        int ans;
//        Node1 curr=node;
//        while(count<ind){
//            curr=curr.next;
//            count++;
//        }
//        ans =curr.data;
//        return ans;
//    }
//}