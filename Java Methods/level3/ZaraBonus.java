import java.util.Random;
public class ZaraBonus {
    public static void main(String[] args) {
        int employees = 10;
        double[][] salaryAndService = generateSalaryAndService(employees);
        System.out.println("Employee\tOld Salary\tYears of Service");
        for (int i = 0; i < employees; i++) {
            System.out.printf("%d\t\t%.2f\t\t%.0f\n", i + 1, salaryAndService[i][0], salaryAndService[i][1]);
        }
        double[][] newSalaryAndBonus = calculateNewSalaryAndBonus(salaryAndService);
        System.out.println("\nEmployee\tOld Salary\tYears of Service\tBonus\t\tNew Salary");
        for (int i = 0; i < employees; i++) {
            System.out.printf("%d\t\t%.2f\t\t%.0f\t\t\t%.2f\t\t%.2f\n", i + 1, salaryAndService[i][0], salaryAndService[i][1], newSalaryAndBonus[i][1], newSalaryAndBonus[i][0]);
        }
        displayTotals(salaryAndService, newSalaryAndBonus);
    }
    public static double[][] generateSalaryAndService(int employees) {
        double[][] data = new double[employees][2];
        Random random = new Random();
        for (int i = 0; i < employees; i++) {
            data[i][0] = 10000 + random.nextInt(90000);
            data[i][1] = 1 + random.nextInt(10);
        }
        return data;
    }
    public static double[][] calculateNewSalaryAndBonus(double[][] salaryAndService) {
        double[][] newData = new double[salaryAndService.length][2];
        for (int i = 0; i < salaryAndService.length; i++) {
            double oldSalary = salaryAndService[i][0];
            double years = salaryAndService[i][1];
            double bonusPercent = (years > 5) ? 0.05 : 0.02;
            double bonus = oldSalary * bonusPercent;
            double newSalary = oldSalary + bonus;
            newData[i][0] = newSalary;
            newData[i][1] = bonus;
        }
        return newData;
    }
    public static void displayTotals(double[][] oldData, double[][] newData) {
        double sumOldSalary = 0;
        double sumNewSalary = 0;
        double totalBonus = 0;
        for (int i = 0; i < oldData.length; i++) {
            sumOldSalary += oldData[i][0];
            sumNewSalary += newData[i][0];
            totalBonus += newData[i][1];
        }
        System.out.println("\nTotals:");
        System.out.printf("Sum of Old Salary: %.2f\n", sumOldSalary);
        System.out.printf("Sum of New Salary: %.2f\n", sumNewSalary);
        System.out.printf("Total Bonus Amount: %.2f\n", totalBonus);
    }
}
