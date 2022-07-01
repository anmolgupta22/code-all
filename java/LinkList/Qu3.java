package LinkList;
import java.util.*;
class Node {
    int data;
    Node next;
    Node (int x){
        data=x;
        next=null;
    }
}
class Display
{
    static Node insertAtEnd(Node head, int x){
        Node temp=new Node(x);
        if(head==null){
            return temp;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        return head;
    }
    static int find(Node head, int key1){
        Node cur=head;
        while(cur!=null)
        {
            if(cur.data==key1){
                return 1;
            }
            else{
                cur=cur.next;
            }
        }
        return 0;
    }
    public static void main(String arg[]){
        Scanner key=new Scanner(System.in);
        int n=key.nextInt();
        Node head=null;
        for (int i=0;i<n;i++){
            int x=key.nextInt();
            head=insertAtEnd(head,x);

        }
        int key1=key.nextInt();
        int check=find(head, key1);
        if(check==1){
            System.out.print("yes");
        }
        else
            System.out.print("No");
    }
}
