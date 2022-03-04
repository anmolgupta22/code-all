package BasicLabProblems;
import java.util.Scanner;
class Student{
    private
    int t;
    //String n;
    public
    void name(String str){

        System.out.println(str);
    }
    void mark(int x,int y){
        t=x+y;
        System.out.print("total marks="+t);
    }
}
public class Assigment_2 {
    public static void main(String arg[]){

        Scanner key=new Scanner(System.in);
        int x,y;
        System.out.print("Enter the name=");
       String str=key.nextLine();
        System.out.print("Enter the marks1=");
        x=key.nextInt();
        System.out.print("Enter the marks2=");
        y=key.nextInt();
        Student st=new Student();
        st.name(str);
        st.mark(x,y);

    }
}
