#include<stdio.h>
#include<conio.h>
struct node
{
    int data;
    struct node*link;
};
void append (struct node ** in);
void display(struct node*);
int main()
{
    struct node*p;
    p=NULL;
    append(&p,14);
    append(&p,15);
    append(&p,16);
    append(&p,17);
    append(&p,18);
    display(p);
    void append (struct node **q ,int num)
    {
        struct node*temp*r;
        if(*q=U)
    }
}