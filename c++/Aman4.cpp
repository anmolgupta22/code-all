#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<"          N=";
    cin>>n;

    int a[n];
    cout<<"Enter array=";
    for (int i = 0; i<n; i++)
    {
        cin>>a[i];
    }
    cout<<"     Output=";
        for (int i = n-1; i <= n-1; i++)
    {
        cout <<a[i];
    }

    for (int j = 0; j < n - 1; j++)
    {
        cout << " " << a[j];
    }
}




