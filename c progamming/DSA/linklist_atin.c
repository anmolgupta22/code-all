#include<stdio.h>
#include<stdlib.h>
struct node
{
int data;
struct node *next;
};
struct node *head,*temp,*newnode;
void creatnode()
{
head=0;
int n;
do{
newnode=(struct node*)malloc(sizeof(struct node));
printf("Enter the numer ");
scanf("%d",&newnode->data);
newnode->next=0;
if(head==0)
{
head=temp=newnode;
}
else{
temp->next=newnode;
temp=newnode;
}
printf("\nWant to enter more nodes ? then enter 1 or else 0 ");
scanf("%d",&n);
}while(n==1);
/* temp=head;
while(temp!=0)
{
printf("%d\t",temp->data);
temp=temp->next;
}*/
}
void display()
{
temp=head;
printf("\n THE VALUES ARE \n");
while(temp!=0)
{
printf("%d\t",temp->data);
temp=temp->next;
}
}
void atlast()
{
temp=head;
while(temp->next!=0)
{
temp=temp->next;
}
newnode=(struct node*)malloc(sizeof(struct node));
printf("\nEnter the value for last position \n");
scanf("%d",&newnode->data);
temp->next=newnode;
newnode->next=0;
}
void atfirst()
{
newnode=(struct node*)malloc(sizeof(struct node));
printf("Enter the value for first position \n");
scanf("%d",&newnode->data);
newnode->next=head;
head=newnode;
}
int count()
{ int c=0;
temp=head;
while(temp!=0)
{
c=c+1;
temp=temp->next;
}
return c;
}
void atanypalce()
{
int m,x;
m=count();
printf("Enter the position where you want to add the value\n");
scanf("%d",&x);
if(x<m)
{
newnode=(struct node*)malloc(sizeof(struct node));
printf("Enter the value \n");
scanf("%d",&newnode->data);
temp=head;
for(int i=1;i<x;i++)
{
temp=temp->next;
}
newnode->next=temp->next;
temp->next=newnode;
}
else
printf("wrong position");
}
int main()
{ int a,b;
creatnode();
do{
printf("Enter the options..\n");
printf("1.Display\n");
printf("2.Adding a node at 1st\n");
printf("3.Adding a node at last\n");
printf("4.Adding node at anyposition\n");
printf("5.To count no of node\n");
scanf("%d",&a);
if(a==1)
{
display();
}
else if(a==2)
{
atfirst();
}
else if(a==3)
{
atlast();
}
else if(a==5)
{
int x;
x=count();
printf("\nTotal number nodes %d ",x);
}
else if(a==4)
{
atanypalce();
}
printf("\nWant to try again? then 1 else 0 ");
scanf("%d",&b);
}while(b==1);
}