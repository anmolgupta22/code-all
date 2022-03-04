#include<iostream>
using namespace std;
#define n 100
class stack{
    int* arr;
    int top;
public:
    stack()
    {
        arr=new int[n];
        top=-1;
    }
    void push(int x)
    {
        if(top==n-1)
        {
            cout<<"Stack overflow\n"<<endl;
            return ;
        }
       top++;
        arr[top]=x;
       // cout<<*arr<<endl;
    }
    void pop(){
        if(top==-1)
        {
            cout<<"no elements to pop"<<endl;
            return;
        }
        top--;

    }
    int Top()
    {
        if(top==-1)
        {
            cout<<"No element in stack"<<endl;
            return -1;
        }
        return arr[top];
    }
    bool isEmpty()
    {
        return top==-1;
    }
    void display()
    {

            for(int i=0;i<=top;i++)
            {
                cout<<arr[i]<<endl;
            }
    }
};



int main()
{
stack s;
s.push(10);
s.push(20);
s.push(30);
//s.pop();
s.display();
//cout<<s.push()<<endl;
}

