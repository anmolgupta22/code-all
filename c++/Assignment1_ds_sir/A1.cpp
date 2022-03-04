//Question 1. Write a program to find sum of first N odd numbers. Ex. 1+3+5+7+...........+N
#include<iostream>
using namespace std;
int main()
{ int n,sum=0;
    cout<<"sum of first N odd numbers=";
    cin>>n;
for(int i=1;i<=n;i++)
{
    if(i%2!=0)
    {
         sum=sum+i;
    }
}
cout<<"Output="<<sum;
}
