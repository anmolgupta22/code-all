#include<iostream>
using namespace std;
int main()
{
int i=1,n;
    int s=0;
    cin>>n;
    while (i<=n)
    {
        if(n/i==i)
        {
            s = s+i ;
        }
        i++;
    }

    cout<<s;
    return 0;

}