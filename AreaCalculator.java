import java.util.Scanner;

class AreaCalculator {
    // Area of square
    void area(int side) {
        int result = side * side;
        System.out.println("Area of square: " + result);
    }

    // Area of rectangle
    void area(int l, int b) {
        int result = l * b;
        System.out.println("Area of rectangle: " + result);
    }

    // Area of circle
    void area(double radius) {
        double result = Math.PI * radius * radius;
        System.out.println("Area of circle: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCalculator ac = new AreaCalculator();

        // Square
        System.out.print("Enter side of square: ");
        int side = sc.nextInt();
        ac.area(side);

        // Rectangle
        System.out.print("Enter length of rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        int breadth = sc.nextInt();
        ac.area(length, breadth);

        // Circle
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        ac.area(radius);

        sc.close();
    }
}
