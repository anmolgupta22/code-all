abstract class Shape{

    abstract void draw();

}

class Rectangle1 extends Shape{

    void draw(){

        int l=20;

        int b=20,area;

        area=l*b;

        System.out.println("Area is"+area);

    }

}

class Circle1 extends Shape{

    void draw(){

        int r=10;

        float area;

        area=(float) (2*3.14*r);

        System.out.println("area of circle is: "+area);

    }

}



class try22{

    public static void main(String args[]){

        Shape s=new Circle1();

        Shape d=new Rectangle1();

        s.draw();

        d.draw();

    }

}