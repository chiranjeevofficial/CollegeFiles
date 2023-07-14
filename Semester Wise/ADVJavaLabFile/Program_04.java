abstract class Shape {
    protected int length;
    protected int breadth;
    public Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public abstract void printArea();
}

class Rectangle extends Shape {
    public Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    @Override
    public void printArea() {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {
    public Triangle(int length, int breadth) {
        super(length, breadth);
    }

    @Override
    public void printArea() {
        double area = 0.5 * length * breadth;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle extends Shape {
    public Circle(int length, int breadth) {
        super(length, breadth);
    }

    @Override
    public void printArea() {
        double area = 3.14 * length * length;
        System.out.println("Area of Circle: " + area);
    }
}

public class Program_04 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);
        Triangle triangle = new Triangle(6, 8);
        Circle circle = new Circle(7, 0);

        rectangle.printArea();
        triangle.printArea();
        circle.printArea();
    }
}
