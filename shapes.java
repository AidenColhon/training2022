import java.util.Scanner;

/*
public abstract class Shapes
{
    
    private double width;
    private double height;
    private String color;
}

public class Triangle extends Shapes
{

}
*/
/*
public abstract class shapes {
    public static void main(String args[]) {

        public abstract double getArea();

    public abstract class triangle {

        public static final String ANSI_RED = "\u001B[31m";

        double width;
        double height;

        public triangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getArea() {
            return width * height / 2;
        }

        public static class rectangle {
            double width;
            double height;

            public rectangle(double width, double height) {
                this.width = width;
                this.height = height;
            }

            public double getArea() {
                return width * height;

            }
        }

        public static class Circle extends shapes {
            double radius;

            public static final String ANSI_GREEN = "\u001B[32m";

            public Circle(double radius) {
                this.radius = radius;
            }

            public double getArea() {
                return 3.14 * radius * radius;
            }
        }
    }
}
}
*/

class Shapes {
    public double width;
    public double height;
    public String color;
}

class Triangle extends Shapes {
    public double calculateArea() {
        return ((this.width * this.height) / 2);
    }
}

class Rectangle extends Shapes {
    public double calculateArea() {
        return (this.width * this.height);
    }
}

class Circle extends Shapes {
    public double radius;
    private double pi = 3.14;

    public double calculateArea() {
        return (this.radius * this.radius * this.pi);
    }

}

public static void main(String args[])
{
    
        Circle circ;
        Rectangle rect;
        Triangle tri;
        double area;
        String color;
        circ.radius = 2;
        circ.color = "red";
        area = circ.calculateArea();
        color = circ.color;

        System.out.format("Circle area: %lf\n", area);
        System.out.format("Cirlce color: %s\n", color);

        rect.width = 4;
        rect.height = 5;
        rect.color = "blue";
        area = rect.calculateArea();
        color = rect.color;

        System.out.format("Rectangle area: %lf\n", area);
        System.out.format("Rectangle color: %s\n", color);

        tri.height = 3;
        tri.width = 5;
        tri.color = "green";
        area = tri.calculateArea();
        color = tri.color;

        System.out.format("Triangle area: %lf\n", area);
        System.out.format("Trianble color: %s\n", color);
}