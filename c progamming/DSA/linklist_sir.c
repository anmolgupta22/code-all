#include<stdio.h>
#include<stdlib.h>// malloc function
struct node{
    int item;
    struct node * link;
};
typedef struct node node;// renaming
node * create(int x)
{
    node * temp=(node *)malloc(sizeof(node));
    temp->item=x;
    temp->link=NULL;
    return temp;
}
node * insert(node * head, int x,int choice)
{
    node *temp; int pos;
    node *q=head;
    temp=create(x);// create a node
    if(head==NULL)
        head=temp;
    else if(choice==1)// begining
    {
        temp->link=head;
        head=temp;
    }
    else if(choice==2)// end
    {
        while(q->link!=NULL)
        {
            q=q->link;
        }
        q->link=temp;
    }
    else
    {
        printf("enter the position\n");
        scanf("%d",&pos);
        for(int i=1;i<pos-1;i++)
            q=q->link;
        temp->link=q->link;
        q->link=temp;
    }
    return head;
}
node * del(node * head, int choice)
{

    node * temp;node * q=head;int pos;
    if (head==NULL)
    {
        printf("linked list is empty");
    }
    else if(choice==1)
    {
        temp=head;
        head=head->link;
        free(temp);
    }
    else if(choice ==2)
    {
        while(q->link->link!=NULL)
            q=q->link;
        temp=q->link;
        free(temp);
    }
    else{
        for(int i=1;i<pos-1;i++)
            q=q->link;
        temp=q->link;
        q->link=temp->link;
        free(temp);
    }
    return head;
}
display(node * head)
{
while (head!=NULL)
{
printf("%d->",head->item);
head=head->link;
}
}
int main()
{
    node * head=NULL; int x, choice,check, select;
    do{
        printf("1:Insert an element\n 2: Delete an element\n");
        scanf("%d",&choice);
        if(choice==1)
        {
            printf("\n1: begin \n 2: end \n3: any pos\n");
            scanf("%d",&select);
            printf("\n enter an element\n");
            scanf("%d",&x);
            head=insert(head,x,select);

        }
        else if(choice==2){
            printf("\n1: begin \n 2: end \n3: any pos\n");
            scanf("%d",&select);
            head=del(head,select);
        }
        else
            exit(0);
        display(head);
        printf("\n do you want to coutinue 1: YES\n");
        scanf("%d",&check);
    }while(check==1);



    return 0;
}