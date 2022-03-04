#include<iostream>
using namespace std;

int binary(string arr[],string x, int n)
{
    int mid ,lower=0,upper=n,flag=1;
    for(mid =(lower+upper)/2;lower<=upper;mid=(lower+upper)/2) {
        if (arr[mid] == x) {
            cout << "The Number is a position in array=" << mid;
            flag = 0;
            break;
        }

        if (arr[mid] > x)
            upper = mid - 1;

        if(arr[mid]<x)

            lower = mid + 1;
    }
    if(flag)
        cout<<("Element is not present in array");


}

int main()
{
  string arr[]={"Babka","Baklava", "Cheesecake","Cupcake","Danish","Eclair","Funnelcake",
                "Kringle","Lamingtin","Profiterole","Sopaipilla","Tiramisu","Torte",
                "Turnover","Strudel"};
  int n=14;
  string x;
  cout<<"Enter the search character=";
  cin>>x;

    binary(arr,x,n);


}