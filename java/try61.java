abstract class school {
    int i=0;
    public school ()
    {
        display ();
        i=2;
    }
    abstract void myMethod();
    void display ()
    {
        System.out.println(i);
    }
}
interface Student
{
    abstract void myMethod();

}
class Teacher extends school implements Student
{
    public Teacher ()
    {
        super ();
        i=1;
    }

    @Override
    public void myMethod()
    {
        new Teacher ();
    }
}
class Marks extends Teacher
{
    public Marks()
    {
        i=5;
        myMethod();

    }
}

public class try61 {
    public static void main(String[] args) {
        Marks stu= new Marks();
    }
}