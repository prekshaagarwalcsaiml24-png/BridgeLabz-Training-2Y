import java.util.Scanner;
public class LongestWord {
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        sc.close();
        String longestWord = findLongestWord(input);
        System.out.println("The longest word is: " + longestWord);
    }
}