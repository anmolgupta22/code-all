// { Driver Code Starts
import java.util.*;
class Node1
{
    int data;
    Node1 next;

    Node1(int a)
    {
        data = a;
        next = null;
    }
}
class GfG1 {
    static Scanner sc = new Scanner(System.in);

    public static Node1 inputList(int size) {
        Node1 head, tail;
        int val;

        val = sc.nextInt();

        head = tail = new Node1(val);

        size--;

        while (size-- > 0) {
            val = sc.nextInt();
            tail.next = new Node1(val);
            tail = tail.next;
        }

        return head;
    }

    public static void printList(Node1 n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String args[]) {

        int t = sc.nextInt();
        while (t-- > 0) {
            int n, m;

            n = sc.nextInt();
            m = sc.nextInt();

            Node1 head1 = inputList(n);
            Node1 head2 = inputList(m);

            Sol obj = new Sol();

            Node1 result = obj.findIntersection(head1, head2);

            printList(result);
            System.out.println();
        }
    }
}// } Driver Code Ends


/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Sol
{
    public static Node1 findIntersection(Node1 head1, Node1 head2)
    {


        Node1 ptr12 = head1;
        Node1 ptr2 = head2;
        Node1 head = null;
        Node1 curr = null;
        while (ptr12 != null && ptr2 != null) {
            if (ptr12.data == ptr2.data) {
                if (head == null) {
                    Node1 temp = new Node1(ptr12.data);
                    head = temp;
                    curr = temp;
                } else {
                    Node1 temp = new Node1(ptr12.data);
                    curr.next = temp;
                    curr = curr.next;
                }
                ptr12 = ptr12.next;
                ptr2 = ptr2.next;
            } else {
                if (ptr12.data < ptr2.data) {
                    ptr12 = ptr12.next;
                } else {
                    ptr2 = ptr2.next;
                }
            }
        }
        return ptr12;
    }
}


