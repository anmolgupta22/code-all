 class test
{
    private
    int i,j;
    public
    void add(int i,int j)
    {
        i=i+10;
        j=j+10;
        System.out.println(i);
        System.out.println(j);
    }
}

public class try7
{
    public static void main(String arg[])
    {
       int i,j;
        i=10;
        j=11;

        test t=new test();
        t.add(i,j);
    }
}
