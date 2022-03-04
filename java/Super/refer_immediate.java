package Super;
//refer immediate parent class
class Anmol
{
  Anmol()
  {
      System.out.println("My name is Anmol gupta");
  }
}
class gopal extends Anmol
{

    gopal()
    {
        super();
        System.out.println("My Name Is Gopal ji ");
    }

}

public class refer_immediate {
    public static void main(String[] args) {

        gopal key =new gopal();
    }
}
