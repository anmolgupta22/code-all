//class company {
//    String name;
//}
//private class try15 {
//    public static void main(String arg[])
//    {
//       company c1=new company();
//       c1.name= "Ethnus";
//        company c2=c1;
//        //c1=null;
//        System.out.println(c2.name);
//    }
//}

    // Java program to demonstrate execution
// of static blocks and variables
   public class try15 {
        // static variable
      static   int a = m1();

        // static block
        static
        {
            System.out.println("Inside static block");
        }

        // static method
        static int m1()
        {
            System.out.println("from m1");
            return 20;
        }

        // static method(main !!)
        public static void main(String[] args)
        {
            System.out.println("Value of a : "+a );
            System.out.println("from main");
        }
    }
