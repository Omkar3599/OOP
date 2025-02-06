import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        int characterCount = input.length();
        String[] words = input.split("\\s+");
        int wordCount = words.length;
        String[] lines = input.split("\\n");
        int lineCount = lines.length;

        int vowelCount = 0;
        for (char c : input.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                vowelCount++;
            }
        }

        System.out.println("Characters: " + characterCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Lines: " + lineCount);
        System.out.println("Vowels: " + vowelCount);
        
        sc.close();
    }
}
