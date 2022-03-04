package BasicLabProblems;

import java.awt.print.Book;
import java.sql.SQLOutput;
import java.util.Scanner;

class Library {
    private
    int BookNo;
    String BName;
    String Author;
    String Publisher;
    int Price;
    int No_of_copies;
    int No_of_copies_Issued;

    public
    void initial() {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter the BookNo=");
        BookNo = key.nextInt();
        System.out.print("Enter the Book Name=");
        BName = key.nextLine();
        System.out.println("Enter the Author=");
        Author = key.nextLine();
        System.out.print("Enter the Publisher=");
        Publisher = key.nextLine();
        System.out.print("Enter the Price=");
        Price = key.nextInt();
        System.out.print("Enter the No_of_copies=");
        No_of_copies = key.nextInt();
        System.out.print("Enter the No_of_copies_Issued=");
        No_of_copies_Issued = key.nextInt();

    }

    void issue_book() {

        System.out.println("Enter the Book Details....");
        initial();
        if (No_of_copies > 0) {
            Scanner key = new Scanner(System.in);
            System.out.println("Enter How many Book you want to Issue=");
            No_of_copies_Issued = key.nextInt();
            if (No_of_copies >= No_of_copies_Issued) {
                No_of_copies = No_of_copies - No_of_copies_Issued;
                System.out.println(" " + No_of_copies_Issued+" book is issued...");
                display();

            } else {
                System.out.println(No_of_copies_Issued+" book is not available in stock");

            }

        } else
            System.out.println("book is not available");
    }


    void return_book() {
        System.out.println("enter book detail you want to return...");
        Scanner key = new Scanner(System.in);

        System.out.println("Enter Book Nunber=");
        BookNo = key.nextInt();
        System.out.println("Enter book Name=");
        BName = key.nextLine();
        No_of_copies = No_of_copies + No_of_copies_Issued;
        System.out.println(BookNo + ":" + BName + "Book is returned....");
    }

    void display() {
        System.out.println("Book Number=" + BookNo);
        System.out.println("Book Name=" + BName);
        System.out.println("Author Name=" + Author);
        System.out.println("Publisher Namer=" + Publisher);
    }
}
public class Assignment_4 {
    public static void main(String arg[]){
        int ch;
        Library l=new Library();
        Scanner key=new Scanner(System.in);
        System.out.println("1-> Issue Book...");
        System.out.println("2-> Return Book....");
        System.out.print("Enter your choice....");
        ch= key.nextInt();

        switch (ch) {
            case 1:
                l.issue_book();
                break;
            case 2:
                l.return_book();
                break;
        }

        }
    }

