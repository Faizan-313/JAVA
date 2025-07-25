import shapes.*;

public class Main {
    public static void main(String[] args) {
        Shape s;

        s = new Circle(5);           // Circle with radius 5
        System.out.println("Area of Circle: " + s.area());

        s = new Rectangle(4, 6);     // Rectangle 4x6
        System.out.println("Area of Rectangle: " + s.area());

        s = new Triangle(3, 7);      // Triangle base=3, height=7
        System.out.println("Area of Triangle: " + s.area());
    }
}
