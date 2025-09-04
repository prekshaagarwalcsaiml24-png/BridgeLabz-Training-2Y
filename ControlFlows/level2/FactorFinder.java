import java.util.*;
public class FactorFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt(); 
        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            return;
        }
        System.out.println("Factors of " + number + " are:");
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
