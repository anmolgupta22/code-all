class Alpha
{
    static String s="";
    protected Alpha() {
        s +="alpha";
    }
}
class SubAlpha extends Alpha
{
    private SubAlpha()
    {
        s+="sub";
    }
}

public class try52 extends Alpha {
   private try52()
    {
        s+="subsub";
    }
    public static void main(String[] args) {
        new try52();
        System.out.println(s);
    }
}
