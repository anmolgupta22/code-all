#include<stdio.h>
#include<stdlib.h>
struct node
{
    int item;
    struct node * next;
};
typedef struct node node;
node * create(int k)
{
    node *p;
    p=(node*)malloc(sizeof(node));
    p->item=k;
    p->next=NULL;
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

void operation(node *head, int k)
{
    int count=0;
    while(head!=NULL)
    {
        if(head->item==k)
            count++;
        head=head->next;
    }
    printf("the element %d occurs % d times",k,count);
}
node* reverse(node *head) {
    node *curr = head;
    node *prev = NULL;
    while (curr != NULL) {
        node *next = curr->next;
        curr->next = prev;
        curr = next;
    }
    return prev;
}
    void display1(node*head)
    {
        while (head!=NULL)
        {
            printf("%d=>",head->item);
            head=head->next;
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
    //display(head);
    //printf("which element do you want to count");
  //  scanf("%d",&cnt);
   // operation(head,cnt);
    reverse(head);
    display1(head);
    return 0;

}