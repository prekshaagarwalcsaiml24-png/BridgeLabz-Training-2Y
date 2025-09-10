import java.util.Scanner;
public class VowelConsonantCount {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        sc.close();
        int vowels = 0;
        int consonants = 0;
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}