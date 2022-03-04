#include<iostream>
using namespace std;
int main()
{
    int arr[5]={25,17,31,13,2};
    int i,j,k,temp;
    cout<<"Insertion sort"<<endl;
    cout<<"Array before sorting="<<endl;
    for(i=0;i<=4;i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<endl;
    for(i=1;i<=4;i++)
    {
        for(j=0;j<i;j++)
        {
        if(arr[j]>arr[i])
        {
            temp=arr[j];
            arr[j]=arr[i];
            for(k=i;k>j;k--)
            {
                arr[k]=arr[k-1];
                arr[k+1]=temp;
            }
        }
        }
        cout<<"Array after sorting="<<endl;
        for(i=0;i<=4;i++)
        {
            cout<<arr[i]<<" ";
        }
    }
}