#include<iostream>
using namespace std;
#include <string.h>

int checkpalindrome(char *s)
{
    int i,c=0,n;
    n=strlen(s);
    for(i=0;i<n/2;i++)
    {
        if(s[i]==s[n-i-1])
            c++;

    }
    if(c==i)
        return 1;
    else
        return 0;



}
int main()
{

    char s[1000];

    cout<<"Enter  the string: ";
    cin>>s;


    if(checkpalindrome(s))
        cout<<"string is palindrome";
    else
        cout<<"string is not palindrome";



}