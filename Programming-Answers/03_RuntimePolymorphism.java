abstract class Shape {
    abstract double area();
}
class Circle extends Shape {
    private final double radius;
    Circle(double radius) { this.radius = radius; }
    double area() { return Math.PI * radius * radius; }
}
class Rectangle extends Shape {
    private final double length, width;
    Rectangle(double length, double width) { this.length = length; this.width = width; }
    double area() { return length * width; }
}
class RuntimePolymorphism {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(3), new Rectangle(4, 5) };
        for (Shape shape : shapes) System.out.printf("Area: %.2f%n", shape.area());
    }
}
