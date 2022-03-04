public class try42 {
    public static void main(String arg[])
    {
      try
      {
         int a=5;
         int b=5/0;
          System.out.println(b);
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
      finally {
          System.out.println("good");
      }
    }
}
