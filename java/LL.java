import java.util.LinkedList;
import java.util.Scanner;

public class LL {
    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int x) {
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        if (tail == null) {
            tail = head;
        }
        size += 1;

    }

    public void Display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    private static class Node {
        private final int data;
        private Node next;

        public Node(int x) {
            data = x;
            next = null;
        }

    }

    public static void main(String[] arg) {
        Scanner key = new Scanner(System.in);
        LL list = new LL();
        int n = key.nextInt();
        for (int i = 0; i < n; i++) {
            int x = key.nextInt();
            list.insertFirst(x);

            list.Display();
//list.Display();
        }
    }
}