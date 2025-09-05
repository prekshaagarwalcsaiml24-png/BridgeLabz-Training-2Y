import java.util.*;
public class BMIMultiArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();
        double[][] personData = new double[number][3]; // [weight, height, BMI]
        String[] weightStatus = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Enter details for person " + (i + 1));
            double w, h;
            while (true) {
                System.out.print("Weight (kg): ");
                w = sc.nextDouble();
                System.out.print("Height (m): ");
                h = sc.nextDouble();
                if (w > 0 && h > 0) break;
                System.out.println("Invalid input. Enter positive values.");
            }
            double bmi = w / (h * h);
            personData[i][0] = w;
            personData[i][1] = h;
            personData[i][2] = bmi;
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) +
                    " | Height: " + personData[i][1] + " m" +
                    " | Weight: " + personData[i][0] + " kg" +
                    " | BMI: " + personData[i][2] +
                    " | Status: " + weightStatus[i]);
        }
        sc.close();
    }
}