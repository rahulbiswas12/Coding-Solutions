import java.lang.Math;


abstract class Figure {
    double dim1, dim2; // 2 dimensions
    // Figure Constractor
    Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    // Initialize abstract area method
    abstract double area();
}


class Circle extends Figure {
    // Circle class constractor
    Circle(double radius) {
        super(radius, 0); 
    }

    double area() {
        return (Math.PI * (Math.pow(this.dim1, 2)));
    }

}

class Square extends Figure {
    // Square class constractor
    Square(double side) {
        super(side, 0);
    }

    double area() {
        return (Math.pow(this.dim1, 2));
    }

}

class Rectangle extends Figure {
    // Rectangle class constractor
    Rectangle(double len, double width) {
        super(len, width); 
    }

    double area() {
        return (this.dim1 * this.dim2);
    }

}

class Triangle extends Figure {
    // Triangle class constractor
    Triangle(double height, double base) {
        super(height, base); 
    }

    double area() {
        return ((this.dim1 * this.dim2) / 2);
    }

}


class CalculateArea {
    public static void main(String[] args){
        Circle cir = new Circle(3);
        System.out.printf("Area of Circle is: %.2f\n",cir.area());

        Square sqr = new Square(3);
        System.out.println("Area of Square is: "+sqr.area());

        Rectangle rec = new Rectangle(4 , 5);
        System.out.println("Area of Rectangle is: "+rec.area());

        Triangle tri = new Triangle(4, 5);
        System.out.println("Area of Triangle is: "+tri.area());
    }
}
