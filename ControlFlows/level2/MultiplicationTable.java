import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Correct variable name
        System.out.print("Enter a number to generate its multiplication table (from 6 to 9): ");
        int number = sc.nextInt(); // Use 'sc' instead of 'scanner'

        System.out.println("Multiplication table of " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
