import java.util.*;
public class FriendsAgeHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        int[] height = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            age[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            height[i] = sc.nextInt();
        }
        int minAgeIndex = 0, maxHeightIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[minAgeIndex]) {
                minAgeIndex = i;
            }
            if (height[i] > height[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }
        System.out.println("Youngest is " + names[minAgeIndex] + " with age " + age[minAgeIndex]);
        System.out.println("Tallest is " + names[maxHeightIndex] + " with height " + height[maxHeightIndex]);
        sc.close();
    }
}