package Coaching;

class Q3 {
     int add(int x,int y)
    {
        int t=x+y;
        return t;
    }

    public static void main(String[] args) {
        int a=10;
        int b=13;
        int c;
        Q3 key=new Q3();
       c= key.add(a,b);
        System.out.println(c);
    }
}
