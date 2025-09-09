import java.util.Scanner;
public class BMICalculatorTeam {
    public static String[] bmiAndStatus(double weightKg, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weightKg / (heightM * heightM);
        double bmiRounded = Math.round(bmi * 100.0) / 100.0;
        String status;
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 25.0) status = "Normal";
        else if (bmi < 30.0) status = "Overweight";
        else status = "Obese";
        return new String[]{ String.valueOf((int)heightCm), String.valueOf((int)weightKg),
                String.valueOf(bmiRounded), status };
    }
    public static String[][] computeAll(double[][] hw) {
        String[][] out = new String[hw.length][4];
        for (int i = 0; i < hw.length; i++) {
            double weight = hw[i][0];
            double height = hw[i][1];
            String[] res = bmiAndStatus(weight, height);
            out[i][0] = res[0]; 
            out[i][1] = res[1]; 
            out[i][2] = res[2];
            out[i][3] = res[3]; 
        }
        return out;
    }
    public static void display(String[][] table) {
        System.out.printf("%-6s %-8s %-6s %-12s%n", "Person", "Height", "Weight", "BMI(Status)");
        for (int i = 0; i < table.length; i++) {
            System.out.printf("%-6d %-8s %-6s %-12s%n", (i+1), table[i][0] + "cm", table[i][1] + "kg",
                    table[i][2] + " (" + table[i][3] + ")");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] hw = new double[10][2];
        System.out.println("Enter weight(kg) and height(cm) for 10 members:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i+1) + " weight (kg): ");
            hw[i][0] = sc.nextDouble();
            System.out.print("Person " + (i+1) + " height (cm): ");
            hw[i][1] = sc.nextDouble();
        }
        String[][] result = computeAll(hw);
        System.out.println("\nResults:\n");
        display(result);
        sc.close();
    }
}
