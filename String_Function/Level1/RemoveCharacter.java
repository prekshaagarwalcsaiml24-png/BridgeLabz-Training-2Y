import java.util.Scanner;
public class RemoveCharacter {
    public static String removeChar(String text, char ch) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ch) {
                result += text.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.print("Enter the character to remove: ");
        char ch = sc.next().charAt(0);
        sc.close();
        String modified = removeChar(input, ch);
        System.out.println("Modified String: " + modified);
    }
}