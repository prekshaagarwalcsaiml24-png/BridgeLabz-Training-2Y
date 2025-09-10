import java.util.Scanner;
public class LexicographicalCompare {
    public static int compareStrings(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        int minLength = Math.min(n1, n2);
        for (int i = 0; i < minLength; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.charAt(i) - s2.charAt(i);
            }
        }
        return n1 - n2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String str1 = sc.nextLine();
        System.out.print("Enter String 2: ");
        String str2 = sc.nextLine();
        sc.close();
        int result = compareStrings(str1, str2);
        if (result == 0) {
            System.out.println("Both strings are equal.");
        } else if (result < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" lexicographically.");
        } else {
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" lexicographically.");
        }
    }
}