import java.util.*;
public class FactorFinderWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt(); 
        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            return;
        }
        int i = 1;
        System.out.println("Factors of " + number + " are:");
        while (i < number) {
            if (number % i == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
