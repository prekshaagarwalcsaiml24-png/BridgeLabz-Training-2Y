import java.util.*;
public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive and Even");
                } else {
                    System.out.println(num + " is Positive and Odd");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Zero");
            }
        }
        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        System.out.print("Comparison of first and last element: ");
        if (first == last) {
            System.out.println("Both are Equal");
        } else if (first > last) {
            System.out.println("First element (" + first + ") is Greater than Last element (" + last + ")");
        } else {
            System.out.println("First element (" + first + ") is Less than Last element (" + last + ")");
        }
        sc.close();
    }
}