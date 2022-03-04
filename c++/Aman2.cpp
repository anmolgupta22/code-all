#include<iostream>
using namespace std;

int main()
{

   int i,j, a[]={1,6,4,3,5,9,5};
    int count=0;
   for(i=0;i<7;i++)
   {
       for (j =i+1; j <7; j++)
       {
           if (a[i] + a[j] == 10)
           {

               count = count + 1;

           }

       }
   }
    cout<<count;
 }


