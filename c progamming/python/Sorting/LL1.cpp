#include<iostream>
using namespace std;
struct  Node
        {
          int data;
          Node *next;
          Node(int x)
          {
              data=x;
              next=NULL;
          }
        };
void print(Node *head)
{
   Node *curr =head;
   while(head!=NULL)
   {
       cout<<"Element:"<<curr->data<<endl;
       curr=curr->next;
   }
}
void beginsert()
{
    struct node *ptr;
    int item;
    //ptr = (struct node *) malloc(sizeof(struct node *));
    if(ptr == NULL)
    {
        printf("\nOVERFLOW");
    }
    else
    {
        printf("\nEnter value\n");
        scanf("%d",&item);
        ptr->data = item;
        struct node *head;
        ptr->next = head;
        head = ptr;
        printf("\nNode inserted");
    }

}
int main()
{
//Node *head= new Node();
//head->next= new Node(20);
//head->next->next=new Node(30);
//head->next->next->next=new Node(40);
//head->next->next->next->next=new Node(50);
//print(head);
    beginsert();

}
