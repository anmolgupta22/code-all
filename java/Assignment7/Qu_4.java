package Assignment7;

import java.util.Scanner;
class Stack {
    int top=-1,size, st[];
    Stack(int capacity){
        Thread t =  new Thread();
        size = capacity;
        st = new int[size];
        t.start();
    }
    int pop(){
        if(top==-1){
            System.out.println("Underflow");
            return Integer.MIN_VALUE;
        }
        top--;
        return st[top+1];

    }
    void push(int x){
        if(top==size-1){
            System.out.println("Overflow");
            return;
        }
        top++;
        st[top] = x;
    }
    boolean isEmpty(){
        return (top==-1);
    }
    int peek(){
        if(top==-1){
            System.out.println("Underflow");
            return Integer.MIN_VALUE;
        }
        return st[top];
    }
}
class Push extends Thread{
    Stack stk;
    Thread t;
    int p;
    Push(Stack s,int pushed_item){
        stk = s;
        p = pushed_item;
        t = new Thread(this);
        t.start();
        //join
        try{
            t.join();
        }catch(Exception e){}
    }
    public void run() {
        stk.push(p);
    }
}
class Pop extends Thread{
    Stack stk;
    Thread t;
    Pop(Stack s){
        stk = s;
        t = new Thread(this);
        t.start();
        //join
        try{
            t.join();
        }catch(Exception e){}
    }
    public void run() {
        System.out.println("Poped Item: "+stk.pop());
    }
}
class IsEmpty extends Thread{
    Stack stk;
    Thread t;
    IsEmpty(Stack s){
        stk = s;
        t = new Thread(this);
        t.start();
        //join
        try{
            t.join();
        }catch(Exception e){}
    }
    @Override
    public void run() {
        System.out.println("Is Stack Empty?: "+stk.isEmpty());
    }

}

public class Qu_4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Stack size:");
        Stack s = new Stack(sc.nextInt());
        //remove the while loop and create objects to achieve multi threading
        while(true){
            int n;
            System.out.print("\n 1. Push\n 2. Pop\n 3. Check\n 4. Exit\n Please Enter Your Choice : ");
            n = sc.nextInt();
            switch(n){
                case 1 :
                    System.out.println("Enter the value to be Pushed:");
                    new Push(s,sc.nextInt());
                    break;
                case 2 :
                    new Pop(s);
                    break;
                case 3 :
                    new IsEmpty(s);
                    break;
                default :
                    System.exit(0);
            }
        }
    }
}

