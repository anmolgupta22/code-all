#include<iostream>
using namespace std;
struct Node
{
    int data;
    Node *next;
    Node(int d) {
        data = d;
        next = NULL;
    }
};
void printList(Node *head)
{
    while(head!=NULL)
    {
        cout<<"Element:"<<head->data<<endl;
        head=head->next;
    }
}
int main()
{
 Node * head=new Node(10);
 printList(head);
}