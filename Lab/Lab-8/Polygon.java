interface Shape {
    double area();
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

public class Polygon {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 3);
        System.out.println("Area of Rectangle: " + rectangle.area());

        Shape circle = new Circle(4);
        System.out.println("Area of Circle: " + circle.area());
    }
}
