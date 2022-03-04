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
};
void printList(Node *head)
{
    Node *curr=head;
    while ((curr!=NULL))
    {
        cout<<"Element :"<<curr->data<<endl;
        curr=curr->next;
    }
}
int search(Node *head, int x)
{
    if(head==NULL) {
        return -1;
    }
        if(head->data==x)
            return 1;
        else
        {
            int res= search(head->next,x);
            if(res==-1)
             return -1;
            else
                return (res+1);
    }
}
int main()
{
    Node *head=new Node(10);
    head->next=new Node(20);
    head->next->next=new Node(30);
    head->next->next->next=new Node(40);
    printList(head);
    int x;
    cin>>x;
   int a=search(head,x);
   cout<<"Find position="<<a;
    return 0;
}