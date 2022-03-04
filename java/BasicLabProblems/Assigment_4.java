package BasicLabProblems;


import java.sql.SQLOutput;
import java.util.Scanner;

class Batsman
{
private
String F_name;
String  L_name;
int Runs_made;
int four;
int Six;
public
void  initial() {
    Scanner key = new Scanner(System.in);
    System.out.print("Enter First Name=");
    F_name = key.nextLine();
    System.out.print("Enter last Name=");
    L_name = key.nextLine();
    System.out.print("Enter only single Run=");
    Runs_made = key.nextInt();
    System.out.print("Enter Number_of_four=");
    four = key.nextInt();
    System.out.print("Enter Number_of_six=");
    Six = key.nextInt();
}
         void update()
    {
        Scanner key=new Scanner(System.in);

        int new_run;
        int new_four;
        int new_six;
        System.out.print("Enter New single run=");
        new_run=key.nextInt();
        System.out.print("Enter new four=");
        new_four= key.nextInt();
        System.out.print("Enter new six=");
        new_six=key.nextInt();

        int  news_four = new_four+four;
        int total=news_four*4;
      int   news_six=new_six+Six;
      int total1=news_six*6;
  Runs_made=Runs_made+new_run+total+total1;
display();
        System.out.println("Total Runs Made="+Runs_made);
        System.out.println("Number of fours="+total);
        System.out.println("Number of sixs="+total1);

    }

void display(){
    System.out.println("..........Batsman infomation...............");
    System.out.print("Name:"+F_name);
    System.out.println(" "+L_name);


}

}

public class Assigment_4 {
    public static void main(String arg[])
    {
        Batsman b1=new Batsman();
        b1.initial();
        b1.update();
    }
}

