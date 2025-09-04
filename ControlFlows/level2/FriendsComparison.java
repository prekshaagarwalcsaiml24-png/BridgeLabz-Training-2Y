import java.util.*;
public class FriendsComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter Amar's age: ");
        int ageAmar = sc.nextInt(); 
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = sc.nextInt();
        System.out.print("Enter Amar's height (in cm): ");
        int heightAmar = sc.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        int heightAkbar = sc.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        int heightAnthony = sc.nextInt();
        String youngest = "Amar";
        int minAge = ageAmar;
        if (ageAkbar < minAge) {
            minAge = ageAkbar;
            youngest = "Akbar";
        }
        if (ageAnthony < minAge) {
            minAge = ageAnthony;
            youngest = "Anthony";
        }
        String tallest = "Amar";
        int maxHeight = heightAmar;
        if (heightAkbar > maxHeight) {
            maxHeight = heightAkbar;
            tallest = "Akbar";
        }
        if (heightAnthony > maxHeight) {
            maxHeight = heightAnthony;
            tallest = "Anthony";
        }
        System.out.println("\nThe youngest friend is: " + youngest + " (Age: " + minAge + ")");
        System.out.println("The tallest friend is: " + tallest + " (Height: " + maxHeight + " cm)");
    }
}
