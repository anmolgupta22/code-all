package p1;

public class try26
{

    int n;
    public try26(int m)
    {

        n=m;
    }

    public int cubes()
    {

        return(n*n*n);
    }
    public void show()
    {

        System.out.println("cube="+cubes());
    }
}