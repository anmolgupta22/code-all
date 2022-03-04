#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#include<time.h>
void print(int a[])
{
    int i;
    for(i=0;i<10;i++)
    {
        printf("%d\n",a[i]);
    }
}
void bubble(int  a[])
{
    int i,j,temp;
    for(i=0;i<10;i++)
    {
        for(j=i+1;j<10;j++)
        {
            if(a[j]>a[i])
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
}
void main()
{

    int i,j,temp,a[10];
    for(i=0;i<10;i++)
    {
        printf("%d",rand());
    }
    printf("Before sorting array elements are=\n");
    print(a);
    bubble(a);
    printf("\n After sorting array elements are-\n");
    print(a);
    getch();
}
