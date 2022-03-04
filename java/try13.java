import java.util.Scanner;

class person {
    protected
    String name="Anmol Gupta";
    String gender="Male";
    int age=20;
    long phone =981218425;
    String addres="kanpur";
   public
   void display(){

   }
}

class mark extends person
 {
    int t;
               public
               void display()
               {
                   mark m = new mark();
                   m.display();
                   System.out.println(m.name);
                   System.out.println(m.gender);
                   System.out.println(m.age);
                   System.out.println(m.phone);
                   System.out.println(m.addres);

                    Scanner key = new Scanner(System.in);
                    System.out.print("subject first marks=");
                    int a = key.nextInt();
                   System.out.print("subject Second marks=");
                   int b= key.nextInt();
                   t=a+b;
                   System.out.print("total="+t);

                }


}


public class try13 {

    public static void main(String arg[]){



        mark p=new mark();
        p.display();




    }
}
