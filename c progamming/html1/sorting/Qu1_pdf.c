#include<stdio.h>
#include<stdlib.h>
 int n=12;
int a[12];
int m;
m= n / 3;
// we have three stacks range{0 to n-1}
int tos1=m+1;
int tos2=m-1;
int tos3=2*m+1;
void push(int sn, int k)
{
    if(sn==1)// first stack
    {
        if(tos1==0)
            printf("stack one is full");
        else
        {
            tos1--;
            a[tos1]=k;
        }
    }
    else if(sn==2)// second stack
    {
        if(tos2==(2*m+1))
            printf("stack two is full");
        else
        {
            tos2++;
            a[tos2]=k;
        }
    }
    else if(sn==3)
    {
        if(tos3==(n-1))
            printf("stack three is full");
        else
        {
            tos3++;
            a[tos3]=k;
        }
    }
    else
        printf("wrong choice");
}
void pop(int sn)
{
    if(sn==1)
    {
        if(tos1==(m+1))
            printf("stack one is empty");
        else
        {
            tos1++;
        }
    }
    else if(sn==2)
    {
        if(tos2==(m-1))
            printf("stack two is empty");
        else
        {
            tos2--;
        }
    }
    else if(sn==3)
    {
        if(tos3==(2*m+1))
            printf("stack three is empty");
        else
        {
            tos3--;
        }
    }
    else
        printf("wrong choice");
}
int main()
{





    int k;// stack number
    int oper,elm, choice;
    do
    {

        printf("which stack number you want to do the operations");
        scanf("%d", &k);
        printf("which operation do you want 1: PUSH\n 0: POP\n");
        scanf("%d",&oper);
        if(oper==1)
        {
            printf("enter the element");
            scanf("%d",&elm);
            push(k,elm);
        }
        else
        {
            pop(k);
        }
        printf("do you want to continue press 1: continue\n");
        scanf("%d",&choice);
    }while(choice==1);
    return 0;
}