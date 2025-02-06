import java.util.Scanner;

public class replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String input = sc.nextLine();
        System.out.println("Enter a replacement character:");
        char replacement = sc.next().charAt(0);
        
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256];
        
        for (char c : input.toCharArray()) {
            if (seen[c]) {
                result.append(replacement);
            } else {
                result.append(c);
                seen[c] = true;
            }
        }

        System.out.println("Result: " + result.toString());
        sc.close();
    }
}
