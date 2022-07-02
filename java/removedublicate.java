import java.util.*;
class Node {
    int data;
    Node1 next;
    Node (int x){
        data=x;
        next=null;
    }
}

class display{
    static Node1 insertAtEnd(Node1 head, int x){
        Node1 temp=new Node1(x);
        if(head==null){
            return temp;
        }
        Node1 curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        return head;
    }
    static Node1 Swap(Node1 head){
        Node1 curr=head;
        Node1 temp=null;
        while(curr!=null){
            curr=curr.next;
        }
        temp=curr.next;
        curr.next=head;
        head=temp;

        return head;

    }

    public static void main(String arg[]){
        Scanner key=new Scanner(System.in);
        int n=key.nextInt();
        Node1 head=null;
        for(int i=0;i<n;i++){
            int x=key.nextInt();
            head=insertAtEnd(head,x);
        }
        PrintList(head);
        Swap(head);
        PrintList1(head);

    }
    static void PrintList(Node1 head){
        Node1 curr=head;
        System.out.print("Before Swap :");
        while(curr!=null){
            System.out.print(" "+curr.data);
            curr=curr.next;
        }
    }

    static void PrintList1(Node1 head){
        Node1 curr=head;
        System.out.print("After Swap :");
        while(curr!=null){
            System.out.print(" "+curr.data);
            curr=curr.next;
        }
    }
}