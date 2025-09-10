import java.util.Scanner;
public class ReplaceWord {
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String[] words = sentence.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.equals(oldWord)) {
                result.append(newWord).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }
        return result.toString().trim();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Enter the word to replace: ");
        String oldWord = sc.nextLine();
        System.out.print("Enter the new word: ");
        String newWord = sc.nextLine();
        sc.close();
        String modifiedSentence = replaceWord(sentence, oldWord, newWord);
        System.out.println("Modified sentence: " + modifiedSentence);
    }
}