public class NumberCheckerAdvanced {
    public static void main(String[] args) {
        int number = 6; // Sample number for demonstration (perfect number)
        System.out.println("Checking number: " + number);
        boolean perfect = isPerfect(number);
        System.out.println("Is perfect: " + perfect);
        boolean abundant = isAbundant(number);
        System.out.println("Is abundant: " + abundant);
        boolean deficient = isDeficient(number);
        System.out.println("Is deficient: " + deficient);
        boolean strong = isStrong(number);
        System.out.println("Is strong: " + strong);
    }
    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
        return sum == num;
    }
    public static boolean isAbundant(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
        return sum > num;
    }
    public static boolean isDeficient(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
        return sum < num;
    }
    public static boolean isStrong(int num) {
        int sum = 0;
        int temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
