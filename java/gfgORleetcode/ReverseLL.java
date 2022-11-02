package gfgORleetcode;

// { Driver Code Starts
import java.util.*;
import java.io.*;

class Node1 {
    int data;
    Node1 next;

    Node1(int x){
        data = x;
        next = null;
    }

}
class anmol {
    static void printList(Node1 node)
    {
        while (node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) throws IOException {

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

            ReverseLL ob = new ReverseLL();
            head = ob.reverseList(head);
            printList(head);
            t--;
        }
    }
}
// } Driver Code Ends


//function Template for Java

/* linked list node class:

class Node {
    int value;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

class ReverseLL
{
    //Function to reverse a linked list.
    Node1 reverseList(Node1 head)
    {
        Node1 prev=null;
        Node1 curr=head;
        reverse(head,curr,prev);
        return head;
    }
     void reverse(Node1 head, Node1 curr, Node1 prev){
        if(head==null){
            head=prev;
            return;
        }
        reverse(head,curr.next,curr);
        curr.next=prev;
    }
}
