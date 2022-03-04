#include<iostream>
using namespace std;
struct Node
{
    int data;
    Node *next;
    Node (int x)
    {
        data=x;
        next=NULL;
    }
};
void printList(Node *head) {
    Node *curr = head;
    while (curr != NULL) {
        cout << "Element:" << curr->data << endl;
        curr = curr->next;

    }
}
int search(Node *head , int x)
{
    int pos=1;
    Node *curr=head;
    while(curr!=NULL)
    {
     if(curr->data==x)
         return pos;
     else
     {
         pos++;
         curr=curr->next;
     }
    }
    return -1;
}

int main()
{
    Node *head = new Node(10);
    head->next = new Node(20);
    head->next->next = new Node(30);
    head->next->next->next = new Node(40);
    printList(head);
    int a=search(head,20);
    cout<<a;

    return 0;

}



