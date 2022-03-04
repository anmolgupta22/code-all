#include<iostream>
using namespace std;
struct Node
{
    int data;
    Node *next;
    Node(int x)
    {
        data=x;
        next=NULL;
    }
    Node *insertEnd(Node *head, int x)
    {
        Node *temp= new Node(10);
        if(head=NULL)
        {
            return temp;
        }
        Node *curr= head;
        while (curr->next!=NULL)
        {
            curr=curr->next;
            curr->next=temp;
            return temp;
        }
    }
};
void printList(Node *head) {
    Node *curr = head;
    while ((curr != NULL)) {
        cout << "Element :" << curr->data << endl;
        curr = curr->next;
    }
}
int main() {
    Node *head = new Node(10);
    Node *head->next = new Node(20);
    Node *head->next->next = new Node(30);


}