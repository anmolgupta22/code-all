//Write a program to print given number in reverse order
#include<iostream>
using namespace std;
int main()
{
    int n,sum;
    cout<<"enter the number=";
    cin>>n;
    cout<<"Reverse number=";
    for(int i=1;i<=n;) {
        sum = n;
        n--;

      cout<<" "<<sum;
    }
}