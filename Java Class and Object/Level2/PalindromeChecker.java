package Level2;
import java.util.*;
public class PalindromeChecker {
    String text;
    PalindromeChecker(String text) {
        this.text = text;
    }
    boolean isPalindrome() {
        String cleanText = text.replaceAll("\\s+", "").toLowerCase();
        int len = cleanText.length();
        for (int i = 0; i < len / 2; i++) {
            if (cleanText.charAt(i) != cleanText.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        PalindromeChecker checker = new PalindromeChecker(text);
        checker.displayResult();
        sc.close();
    }
}
