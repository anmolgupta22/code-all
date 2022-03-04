#include<iostream>
using namespace std;

struct leftStack
{
    int size,Tos,*arr;
    leftStack(int cap){
        arr = new int[cap];
        Tos = size;
    }
    void push(int val){
        if(Tos==0){
            cout<<"overflow";
            return;
        }
        Tos--;
        arr[Tos] = val;
        cout<<"pushed";
    }
    void Pop(){
        if(Tos==size){
            cout<<"underflow";
            return;
        }
        cout<<arr[Tos]<<"poped";
        Tos++;
    }
    bool isEmpty(){
        return (Tos==size);
    }
};
struct rightStack
{
    int size,Tos,*arr,init;
    rightStack(int cap,int strt)
    {
        init = strt;
        arr = new int[cap];
        Tos = init-1;
    }
    void push(int val){
        if(Tos==size){
            cout<<"overflow";
            return;
        }
        Tos++;
        arr[Tos] = val;
    }
    void Pop(){
        if(Tos==init-1){
            cout<<"underflow";
            return;
        }
        cout<<arr[Tos];
        Tos--;
    }
    bool isEmpty(){
        return (Tos==init-1);
    }
};

int main()
{
    int size = 9;
    int ar[size];
    struct leftStack *lftstk1 = new leftStack(size/3);
    struct rightStack *rgtstk1 = new rightStack((2*size)/3,size/3);
    struct rightStack *rgttstk2 = new rightStack((3*size)/3,(2*size)/3);
    lftstk1->push(4);
    lftstk1->Pop();

    return 1;
    
}
