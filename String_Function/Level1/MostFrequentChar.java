import java.util.Scanner;
public class MostFrequentChar {
    public static char findMostFrequentChar(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        int maxCount = 0;
        char mostFrequent = ' ';
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] > maxCount) {
                maxCount = freq[text.charAt(i)];
                mostFrequent = text.charAt(i);
            }
        }
        return mostFrequent;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sc.close();
        char result = findMostFrequentChar(input);
        System.out.println("The most frequent character is: " + result);
    }
}