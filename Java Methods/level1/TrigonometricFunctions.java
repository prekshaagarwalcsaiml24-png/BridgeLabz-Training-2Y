import java.util.Scanner;
public class TrigonometricFunctions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();
        TrigonometricFunctions tf = new TrigonometricFunctions();
        double[] result = tf.calculateTrigonometricFunctions(angle);
        System.out.printf("Sine: %.4f%n", result[0]);
        System.out.printf("Cosine: %.4f%n", result[1]);
        System.out.printf("Tangent: %.4f%n", result[2]);
        scanner.close();
    }
    public double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);
        return new double[] {sin, cos, tan};
    }
}
