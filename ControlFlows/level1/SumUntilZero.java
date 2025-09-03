import java.util.*;
public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double number;
        System.out.print("Enter a number (enter 0 to stop): ");
        number = sc.nextDouble();  
        while (number != 0.0) {
            total += number;
            System.out.print("Enter another number (enter 0 to stop): ");
            number = sc.nextDouble();  
        }
        System.out.println("The total sum of entered numbers is: " + total);
        sc.close();
    }
}
