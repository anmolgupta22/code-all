#include<iostream>
using namespace std;
class cal
{int t;
    int  mul(int a,int b)
    {
        t=a*b;
        return t;
    }
   int div(int a,int b)
   {
        t=a/b;
       return t;
   }
   int add(int a,int b)
   {
        t=a+b;
       return t;
   }
   int sub(int a,int b)
   {
        t=a-b;
   }
};


int main()
{
  int n,a,b;
  cout<<"choice....../*+-";
  cin>>n>>a;

  cout<<"Enter first number=";
  //cin>>a;
  cout<<"Enter second number=";
  cin>>b;
  cal c;


   c.mul(a,b);
   cout<<t;

}