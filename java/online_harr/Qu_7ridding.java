package online_harr;
class Aa
{
    void phone()
    {
        System.out.println("my phone 1");
    }
}

class Ba extends Aa
{
    @Override

    void phone()
    {
        System.out.println("my phone 2");
    }
}

public class Qu_7ridding {
    public static void main(String[] args) {
        Ba b=new Ba();
        b.phone();

    }
}
