public class NumberCheckerPalindrome {
    public static void main(String[] args) {
        int number = 121; // Sample number for demonstration (palindrome)
        int digitCount = countDigits(number);
        System.out.println("Number of digits: " + digitCount);
        int[] digits = storeDigits(number);
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();
        int[] reversed = reverseDigits(digits);
        System.out.print("Reversed digits: ");
        for (int digit : reversed) {
            System.out.print(digit + " ");
        }
        System.out.println();
        boolean equal = arraysEqual(digits, reversed);
        System.out.println("Original and reversed arrays equal: " + equal);
        boolean isPalin = isPalindrome(digits);
        System.out.println("Is palindrome: " + isPalin);
        boolean isDuck = isDuckNumber(digits);
        System.out.println("Is duck number: " + isDuck);
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
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }
    public static boolean arraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigits(digits);
        return arraysEqual(digits, reversed);
    }
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }
}
