package Assignment6;


import java.util.Scanner;

class Test_class {
    int test_code;
    String description;
    int no_candidate, centre_reqd;

    void calcntr() {
        centre_reqd = no_candidate / 100 + 1;
    }

    void schedule() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Test code = ");
        test_code = sc.nextInt();
        System.out.println("Description = ");
        description = sc.next();
        System.out.println("Number = ");
        no_candidate = sc.nextInt();
    }

    void disptest() {
        System.out.println("Test code = " + test_code);
        System.out.println("Description = " + description);
        System.out.println("Nocandidate = " + no_candidate);
        System.out.println("Centres = " + centre_reqd);
    }
}

public class assignment_4 {
    public static void main(String[] args) {
        Test_class key = new Test_class();
        key.schedule();
        key.calcntr();
        key.disptest();
    }

}

