public class NumberCheckerExtended {
    public static void main(String[] args) {
        int number = 21; 
        int digitCount = countDigits(number);
        System.out.println("Number of digits: " + digitCount);
        int[] digits = storeDigits(number);
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();
        int sumDigits = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sumDigits);
        int sumSquares = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits: " + sumSquares);
        boolean isHarshad = isHarshadNumber(number, digits);
        System.out.println("Is Harshad number: " + isHarshad);
        int[][] frequency = digitFrequency(digits);
        System.out.println("Digit frequencies:");
        for (int[] freq : frequency) {
            if (freq[1] > 0) {
                System.out.println("Digit " + freq[0] + ": " + freq[1]);
            }
        }
    }
    public static int countDigits(int num) {
        if (num == 0) return 1;
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
    public static int[] storeDigits(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }
    public static boolean isHarshadNumber(int num, int[] digits) {
        int sum = sumOfDigits(digits);
        return num % sum == 0;
    }
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }
        for (int digit : digits) {
            freq[digit][1]++;
        }
        return freq;
    }
}
