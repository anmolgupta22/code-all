#include<iostream>
using namespace std;


int main()
{
    int i,r,sum,temp;
    int s,e;

    cout<<"starting number of range: ";
    cin >>s;

    cout<<"ending number of range : ";
    cin>>e;

    cout<<"Armstrong numbers in given range are: ";
    for(i=s; i <= e; i++){
        temp=i;
        sum = 0;


        while(temp!=0){
            r=temp % 10;

            temp=temp/10;
            sum=sum+(r*r*r);
        }
        if(sum == i)
            cout<<" "<<i;
    }

}
