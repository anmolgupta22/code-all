public class try91 {
    public static void main(String[] args) {
        ChildClass c = new ChildClass();
        c.print();
    }
}
    class ParentClass {

            int id =1;

            void print() {
                System.out.println(id);
    }
    }

        class ChildClass extends ParentClass {
    int id = 2;

        }
