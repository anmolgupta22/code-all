#include<stdio.h>
#define n 15
int stack[n];
int m=n/3;
int TOP1=n/3;
int TOP2 =(n/3)-1;
int TOP3= (n/3)*2-1;

void push1(int d)
{
  if(TOP1== -1)
  {
    printf("stack overflow \n");
  }
  else
  {
    TOP1--;
    stack[TOP1]=d;
    printf(" %d pushed done \n", d);
  }
}
void push2(int d)
{
  if(TOP2==(2*m))
  {
    printf("stack overflow \n");
  }
  else
  {
    TOP2++;
    stack[TOP2]=d;
    printf(" %d pushed done \n", d);
  }
}
void push3(int d)
{
  if(TOP3==n)
  {
    printf("stack overflow \n");
  }
  else
  {
    TOP3++;
    stack[TOP3]=d;
    printf(" %d pushed done \n", d);
  }
}
void pop1()
{
  if(TOP1== m)
  {
    printf("stack underflow \n");
  }
  else
  {
    printf(" %d poped done \n",stack[TOP1]);
    TOP1++;
  }
}
void pop2()
{
  if(TOP2== (m-1))
  {
    printf("stack underflow \n");
  }
  else
  {
    printf(" %d poped done \n",stack[TOP2]);
    TOP2--;
  }
}
void pop3()
{
  if(TOP3== n)
  {
    printf("stack underflow \n");
  }
  else
  {
    printf(" %d poped done \n",stack[TOP3]);
    TOP3--;
  }
}
void main()
{
int i;
printf("Name    : Anmol Gupta\n");
printf("Reg_no : 21MCA10057\n");
push1(1);
push1(2);
push2(3);
push2(4);
push3(5);
push3(6);
pop1();
pop2();
pop3();
printf("Stack 1\n");
for(i=m-1; i>=TOP1; i--)
{
  printf("index = %d element = %d \n", i, stack[i]);
}
printf("Stack 2\n");
for(i=m; i<=TOP2; i++)
{
  printf("index = %d element = %d \n", i, stack[i]);
}
printf("Stack 3\n");
for(i=2*m; i<=TOP3; i++)
{
  printf("index = %d element = %d \n", i, stack[i]);
}

}
