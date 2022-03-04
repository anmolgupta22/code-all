#include<stdio.h>
int main()

{

int a[10],i,g;

printf("Enter array elements");

for(i=0;i<10;i++)

{

scanf("%d",&a[i]);

}

g=a[0];

for(i=0;i<10;i++)

{

if(g<a[i])

{

g=a[i];

}

}

printf("largest number is=%d",g);



}