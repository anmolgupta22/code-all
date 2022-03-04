#include<iostream>
using namespace std;
struct deque {
    int size, cap, front;
    int *arr;

    deque(int c) {
        arr = new int[cap];
        size = 0;
        front = 0;
        cap = c;
    }

    bool isFull() {
        return (size == cap);
    }

    bool isEmpty() {
        return (size == 0);
    }

    void insertFront(int x) {
        if (isFull()) {
            return;
        }
        front = (front + cap - 1) % cap;
        arr[front] = x;
        size++;
    }

    void insertRear(int x) {
        if (isFull()) {
            return;
        }
        int new_rear = (front + size) % cap;
        arr[new_rear] = x;
        size++;
    }

    int getFront() {
        if (isEmpty()) {
            return -1;
        } else return 0;
    }

    int getRear() {
        if (isEmpty())
            return -1;
        else
            return (front + size - 1) % cap;
    }
        void deleteFront()

        {
            if (isEmpty())
                return;

            front = (front - 1) % cap;
            size--;
        }
        void deleteRear()
        {
            if (isEmpty())
                return ;
            size--;
        }
        void display() {
        int i=0;
            while (int i=front)
            {
                cout<< arr[i];
                i = (i + 1) % size;
            }
            printf("%d", arr[front]);
        }
    };


int main()
{
  deque s(5);
    s.insertRear(10);
    s.insertFront(15);
    s.insertFront(30);
    //s.display();
    //s.getFront();
    cout<<s.getRear()<<endl;

}
