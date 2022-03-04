//interface factorial
//{
//    int fact(int n);
//}
//interface squareCube
//{
//    int square(int n);
//    int cube(int n);
//}
//interface iface3 extends factorial, squareCube
//{
//    void show(int n);
//}
//class InheritDemo implements iface3
//{
//    int fact(int n)
//    {
//        if(n==1)
//            return 1;
//        else
//            return n*fact(n-1);
//    }
//
//    int square(int n)
//    {
//        return(n*n);
//    }
//    int cube(int n)
//    {
//        return (n*n*n);
//    }
//
//    void show(int val)
//    {
//        System.out.println(val);
//        //System.out.println("square = "+square);
//    }
//    public static void main(String[] args)
//    {
//
//        InheritDemo obj = new InheritDemo();
//        obj.show(obj.fact(4));
//        obj.show(obj.square(3));
//        obj.show(obj.cube(3));
//
//    }
//}
//




















import java.util.Scanner;
interface face1 {
  //  int factor();
}



interface face2 {
   // int square();

   // int cube();
}
interface Interface3 extends face1, face2 {
   // public void show();
}
class C implements Interface3 {

    public int factor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no for factorial:");
        int n1 = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n1; ++i) {
            fact = fact * i;

        }
        return fact;
    }

    public int square() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no for square");
        int n2 = sc.nextInt();
        int sq = n2 * n2;
        return sq;

    }

    public int cube() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no for cube:");
        int n3 = sc.nextInt();
        int cb = n3 * n3 * n3;
        return cb;

    }

    public void show() {
        System.out.println("factorial: " + factor());
        System.out.println("square: " + square());
        System.out.println("cube: " + cube());

    }

    public static void main(String args[]) {
//        C c1 = new C();
//        c1.show();


    }
}