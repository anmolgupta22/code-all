#include<iostream>
using namespace std;
int fact(int n)
{
    if (n<=0){
        return n;
    }
    else
        for(int i=1;i<=n;) {
            return n * (n - 1);
        }
}

int main()
{
    int n=5;
    int c=fact(n);
    cout<<c;
}