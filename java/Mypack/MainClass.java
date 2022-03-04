package Mypack;
class MyClass {
    public void my() {
        System.out.println("This is Myclass");
    }

    public class MainClass extends MyClass {
        @Override
        public void my() {
            super.my();
        }

        public void my1() {
            System.out.println("This is MainClass");
        }
    }
}
