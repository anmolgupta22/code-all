#include<iostream>
using namespace std;
struct Node
{
    int data;
    Node *next;
    Node (int d)
    {
        data=d;
        next=NULL;
    }
};
void print(Node *head) {
    Node *curr = head;
    while (curr != NULL) {
cout<<"Element:"<<curr->data<<endl;
curr=curr->next;
    }
}
int  main()
{
    Node *head=new Node(10);
    head->next=new Node(20);
    head->next->next=new Node(30);
    head->next->next->next=new Node(40);
    head->next->next->next->next=head;
    print(head);
}