#include<iostream>
using namespace std;
struct  Node
{
    int data;
    Node *next;
    Node (int x)
    {
        data=x;
        next=NULL;

    }
};
//
Node *insertBegin(Node *head, int x) {
    Node *temp = new Node(x);
    if (head == NULL)
        return temp;
//        Node *curr = head;
//        while (curr->next != NULL)
//            curr = curr->next;
//            curr->next = temp;
//            return head;
    }
void printList1(Node *head) {
    Node *curr = head;
    while ((curr != NULL)) {
        cout << "Element :" << curr->data << endl;
        curr = curr->next;
    }
}

int main()
{
    Node *head = NULL;
    head = insertBegin(head, 30);
    head = insertBegin(head, 20);
    head = insertBegin(head, 10);
    printList1(head);
  //  Node *cur = head;
//  while (cur!= NULL)
//    {
//        cout << " " << (cur->data) << endl;
//        cur = cur->next;
//    }
}