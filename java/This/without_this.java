package This;
//without using this function
class student
{
    int roll;
    String name;
    float marks;
    student (int roll,String name,float marks) {
        roll = roll;
        name = name;
        marks = marks;
    }
        void display()
        {
            System.out.println(roll);
            System.out.println(name);
            System.out.println(marks);
        }
    }





public class without_this {
    public static void main(String[] args) {
        student1 key=new student1(10,"Anmol",5.4f);
key.display();
    }
}
