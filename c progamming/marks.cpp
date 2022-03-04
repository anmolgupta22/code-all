#include<iostream>
using namespace std;
#include<stdio.h>
int main()
{
    int s1,s2,s3,s4,s5,total,p;
    cin>>s1;
    cin>>s2;
    cin>>s3;
    cin>>s4;
    cin>>s5;

total=s1+s2+s3+s4+s5;
p=total/5;
cout<<"total marks="<<total<<endl;
cout<<"percentage="<<p<<endl;
if(p<35)
{
cout<<"Fail";
}
if (p>35 && p<45)
{
    cout<<"pass";

}
if(p>45 && p<60)
{
    cout<<"Second";

}
if(p>60 && p<70)
{
    cout<<"First";

}


}