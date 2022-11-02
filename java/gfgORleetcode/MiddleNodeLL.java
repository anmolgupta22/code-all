package gfgORleetcode;

//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node1 next;

    Node(int x){
        data = x;
        next = null;
    }

}
class GFG{
    static void printList(Node1 node)
    {
        while (node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            Node1 head = new Node1(sc.nextInt());
            Node1 tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node1(sc.nextInt());
                tail = tail.next;
            }
            MiddleNodeLL g = new MiddleNodeLL();
            int ans = g.getMiddle(head);
            System.out.println(ans);
            //printList(head);
            t--;
        }
    }
}

// } Driver Code Ends


/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class MiddleNodeLL
{
    int getMiddle(Node1 head)
    {
        if(head==null){return 0;}
        Node1 curr;
        int count=0;
        int ans=0;
        Node1 temp=head;
        for(curr=head; curr!=null; curr=curr.next){count++;
            curr=head;
        }
        while(ans<count){
            temp=temp.next;
          ans++;
        }
        return temp.data;
    }
}
