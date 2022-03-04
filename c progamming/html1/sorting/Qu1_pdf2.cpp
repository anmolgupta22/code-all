#include<iostream>
using namespace std;
struct left1
{
    int size,tos,*arr;
    left1(int cap)
    {
        arr=new int[cap];
        tos=cap;
    }
    void push(int val) {
        if (tos == 0) {
            cout << "overflow";
            return;
        }
    tos--;
        arr[tos] = val;
        cout << "pushed: "<<arr[tos]<<endl;
    }
        void Pop(int size){
            if(tos==size/3){
                cout<<"underflow";
                return;
            }
            cout<<"poped: "<<arr[tos]<<endl;
            tos++;
        }
        bool isEmpty(){
            return (tos==size);
        }
    };
struct  midle
{
    int size,tos,*arr,init;
    midle(int cap,int start)
    {
        init=start;
        arr= new int[cap];
        tos=start-1;
    }
    void push(int val)
    {
        if(tos==size)
        {
            cout<<"overflow";
            return;
        }
        tos++;
        arr[tos]=val;
        cout<<"pushed:"<<arr[tos]<<endl;
    }

    void pop() {
        if (tos == init - 1) {
            cout << "underflow";
            return;
        }
    cout<<"poped:"<<arr[tos]<<endl;
        tos++
    }
};
int main()
{
int size=9;
int arr[size];
//struct left1 *lf = new left1(size / 3);
struct midle *mid =new midle(2*(size/3), size/3);
    mid->pop();
mid->push(34);
mid->push(23);

mid->pop();mid->pop();
    mid->pop();
    mid->pop();

//lf->push(24);
//lf->push(14);
//lf->push(124);

    return 1;
}