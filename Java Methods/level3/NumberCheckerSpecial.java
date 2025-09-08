public class NumberCheckerSpecial {
    public static void main(String[] args) {
        int number = 5; 
        System.out.println("Checking number: " + number);
        boolean prime = isPrime(number);
        System.out.println("Is prime: " + prime);
        boolean neon = isNeon(number);
        System.out.println("Is neon: " + neon);
        boolean spy = isSpy(number);
        System.out.println("Is spy: " + spy);
        boolean automorphic = isAutomorphic(number);
        System.out.println("Is automorphic: " + automorphic);
        boolean buzz = isBuzz(number);
        System.out.println("Is buzz: " + buzz);
    }
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;
        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }
    public static boolean isSpy(int num) {
        int sum = 0;
        int product = 1;
        int temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }
    public static boolean isAutomorphic(int num) {
        int square = num * num;
        int temp = num;
        while (temp != 0) {
            if (square % 10 != temp % 10) return false;
            square /= 10;
            temp /= 10;
        }
        return true;
    }
    public static boolean isBuzz(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }
}
