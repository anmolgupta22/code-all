//Question 2. Write a program to find 1+1/2+1/3+1/4+....+1/n.
#include<iostream>
using namespace std;
int main()
{
    float n,sum=0;
    cout<<"program to find 1+1/2+1/3+1/4+..=";
    cin>>n;
    for(float i=1;i<=n;i++)
    {
        sum=sum+1/i;


        }
    cout<<"Output="<<sum;
}