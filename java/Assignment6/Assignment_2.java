package Assignment6;
import javax.xml.transform.Source;
import java.util.*;
import java.lang.String;
class Student
{
    int roll_no;
    String name;
    String class_st;
    int[] marks=new int[6];
    float per;
    float total=0;
    void readmarks() {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter the roll no.=");
        roll_no = key.nextInt();
        System.out.print("Enter the name=");
        name = key.next();
        if (name.length() <= 20) {

        } else {
            System.out.println("please Enter the name less than equal 20");
           System. exit(0);
        }
        System.out.print("Enter the class_st=");
        class_st = key.next();
        if (class_st.length() <= 8) {

        } else {
            System.out.println("please Enter the class_st less than equal 8");
            System.exit(0);
        }
        for (int i = 1; i <=5; i++) {

            System.out.print("Enter the " + i + " subject name=");
            marks[i]=key.nextInt();
        }
        for(int i=1;i<=5;i++) {
            total += marks[i];
        }

        per=total/5;
        System.out.println("percentage="+per);
    }

void displaymarks()
{
    System.out.println("******************************************************");
    System.out.println("Roll no.="+roll_no);
    System.out.println("Name="+name);
    System.out.println("Class_st="+class_st);
    for(int i=0;i<=5;i++) {
        System.out.println(i+" Subject name="+marks[i]);
    }
    System.out.println("percentage    ="+per);
}
}

public class Assignment_2 {
    public static void main(String[] args) {
        Student key=new Student();
        key.readmarks();
        key.displaymarks();

    }
}
