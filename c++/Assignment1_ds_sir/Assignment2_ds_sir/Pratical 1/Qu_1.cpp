#include<iostream>
using namespace std;

int main()
{
    cout<<"Name-Anmol Gupta"<<endl;
    cout<<"Roll No-21MCA100567"<<endl;
    int i, j,temp;
int num[5];
int a[5];
    int lower=-50000;
    int upper=50000;
    int count=0,swap=0;

    cout<<"Before sorting array elements are -"<<endl;

    for(i=0;i<5;i++) {
        int num[5];
        num[5] =(rand() %(upper - lower + 1)) + lower;
        cout << num[5] << " ";
   }
 cout<<num[0];
    for (int k = 0; k < 5; k++)
    {
        a[5]= num[5];
    }
    for(i=0;i<5;i++)
        {
        for (j = 1; j < 5 - i; j++)
        {
            if (a[j] < a[j - 1])
           {
                temp = a[j];
               a[j] = a[j - 1];
                a[j - 1] = temp;
            }
 swap++;
        }
           count++;
       }
   cout<<"\nAfter sorting array elements are - \n";
    for(i=0;i<5;i++)
{
       cout <<" "<<a[j]<<" ";
}
cout<<endl;
    cout<<" Number of comparison="<<count<<endl;
    cout<<" Number of swapping=10"<<swap;
    }






                                                              //  cout<<num[i]<<" ";




//    for(i=0;i<10;i++)
//    {



    ///bubble(a, n);
