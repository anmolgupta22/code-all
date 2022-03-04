package This;
//without using this function
class student1
{
    int roll;
    String name;
    float marks;
    student1(int roll, String name, float marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
    void display()
    {
        System.out.println(roll);
        System.out.println(name);
        System.out.println(marks);
    }
}





public class with_this {
    public static void main(String[] args) {
        student1 key=new student1(10,"Anmol",5.4f);
        key.display();
    }
}
