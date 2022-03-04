#include<iostream>
using namespace std;
struct Node {
    int data;
    Node *next;

    Node(int d) {
        data = d;
        next = NULL;
    }
};
struct Mystack {
    Node *head;
    int size;

    Mystack() {
        head = NULL;
        size = 0;
    }

    void push(int x) {
        Node *temp = new Node(x);
        temp->next = head;
        temp = head;
        size++;
        cout << temp << endl;
    }

    int pop() {
        if (head == NULL) {
            cout << "Stack underflow";
            exit(1);
        }
        int res = head->data;
        Node *temp = head;
        head = head->next;
        delete (temp);
        size--;
        return res;

    }

//    int size()
//    {
//        return size;
//
//    }
    bool inEmpty() {
        if (head == NULL)
            return INTMAX_MAX;
        return head->data;
    }

    void display(Node *head) {
        Node *curr = head;
        while (curr != NULL) {
            cout << curr->data << endl;
            curr = curr->next;
        }


    }

    void display()
    {

            Node *curr = head;
            while (curr != NULL)
            {
                cout << curr->data;
                curr = curr->next;
            }



    }
};



int main()
{
   struct Mystack s;
    s.push(10);
    s.push(20);
    s.push(30);
    s.display();
   // Node *head =new Node(10);

   // display(head);
}

//void display(Node *pNode) {
//    Node *curr = pNode;
//    while (curr!=NULL) {
//        cout << curr->data << endl;
//        curr=curr->next;
//    }
//
//}
//
