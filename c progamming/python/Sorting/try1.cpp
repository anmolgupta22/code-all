#include<iostream>
using namespace std;
int main()
{
    int r=5;
    int *p=&r;
    cout<<&(*p)<<endl;
    cout<<&r<<endl;
    cout<<r<<endl;
    cout<<*p<<endl;

}