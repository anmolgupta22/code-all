#include<iostream>
using namespace std;
#include<stdio.h>
int main()
{
    int a[]={0,0,1,1,0};
    int i,j,t;

for(i=0;i<5-1;i++){

    for(j=0;j<5-i-1;j++)
    {
if(a[j]>a[j+1])
{
t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
    }
}
for(i=0;i<5;i++)
{
    cout<<a[i];
}
}
