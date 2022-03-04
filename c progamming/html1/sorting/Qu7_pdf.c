#include<stdio.h>
#include<stdlib.h>
struct node
{
    int item;
    struct node * prev;//
    struct node *next;//
};
typedef struct node node;
node * create(int k)
{
    node *p;
    p=(node*)malloc(sizeof(node));
    p->item=k;
    p->next=NULL;
    p->prev=NULL;
    return p;
}
node* insert(node * head, int k)// insert a node at begining
{
    node *p;
    p=create(k);
    if(head==NULL)
        head=p;
    else
    {
        p->next=head;
        head->prev=p;
        head=p;
    }
    return head;
}
void display(node *head)
{
    while(head!=NULL)
    {
        printf("%d=>",head->item);
        head=head->next;
    }
}

void Remove(node *head)
{
    node *temp;
    temp=head->next;
    while(temp)
    {
        node *k=temp->prev;
        while(head->prev!=NULL)
        {
            node *p
            if(temp->data==k->data)
            {
                p=temp;
                temp->prev->next=temp->next;
                temp->next->prev=temp->prev;
                free(p);
            }
            k=k=>prev;
        }
    }
}

int main()
{
    node *head=NULL;
    int cnt;
    head=insert(head,10);
    head=insert(head,20);
    head=insert(head,10);
    head=insert(head,40);
    head=insert(head,50);
    display(head);
    Remove(head);
    return 0;

}