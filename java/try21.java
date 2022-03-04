abstract class Shapes {

    abstract int area();

}



class Reactangle extends Shapes {

    int width, height;

    Reactangle(int width, int height) {

        this.width = width;

        this.height = height;

    }

    int area() {

        return width*height;

    }

}



class Square extends Shapes {

    int side;



    Square(int side) {

        this.side = side;

    }

    int area() {

        return side * side;

    }

}



class Triangle extends Shapes {

    int breadth, height;



    Triangle(int breadth, int height) {

        this.height = height;

        this.breadth = breadth;

    }

    int area() {

        return (breadth*height)/2;

    }

}



class try21 {

    public static void main(String ...args) {

        Reactangle r = new Reactangle(2,3);

        Square s = new Square(2);

        Triangle t = new Triangle(2,3);



        System.out.println(t.area());

    }

}