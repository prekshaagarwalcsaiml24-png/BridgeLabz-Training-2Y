package Level1;
import java.util.*;
public class Circle {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    double getArea() {
        return Math.PI * radius * radius;
    }
    double getCircumference() {
        return 2 * Math.PI * radius;
    }
    void display() {
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        Circle circle = new Circle(radius);
        circle.display();
        sc.close();
    }
}
