import java.util.Scanner;
public class DistanceAndLineEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        scanner.close();
        double distance = euclideanDistance(x1, y1, x2, y2);
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        System.out.printf("Euclidean distance between points: %.4f%n", distance);
        System.out.printf("Equation of the line: y = %.4fx + %.4f%n", lineEquation[0], lineEquation[1]);
    }
    public static double euclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double m;
        if (x2 - x1 == 0) {
            m = Double.POSITIVE_INFINITY;
        } else {
            m = (y2 - y1) / (x2 - x1);
        }
        double b = y1 - m * x1;
        return new double[]{m, b};
    }
}
