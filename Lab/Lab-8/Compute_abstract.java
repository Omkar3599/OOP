abstract class Shape {
    // Abstract method to compute area
    abstract double area();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor to initialize rectangle dimensions
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing the area method for rectangle
    @Override
    double area() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    // Constructor to initialize circle radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing the area method for circle
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class Compute_abstract {
    public static void main(String[] args) {
        // Creating a rectangle with length 5 and width 3
        Shape rectangle = new Rectangle(5, 3);
        System.out.println("Area of Rectangle: " + rectangle.area());

        // Creating a circle with radius 4
        Shape circle = new Circle(4);
        System.out.println("Area of Circle: " + circle.area());
    }
}
