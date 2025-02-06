import java.util.Arrays;
import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        
        OUTER:
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Check if palindrome");
            System.out.println("2. Sort string alphabetically");
            System.out.println("3. Reverse the string");
            System.out.println("4. Concatenate original and reversed string");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
                case 1:
                    {
                        String reversed = new StringBuilder(input).reverse().toString();
                        System.out.println("Palindrome: " + input.equals(reversed));
                        break;
                    }
                case 2:
                {
                    char[] chars = input.toCharArray();
                    Arrays.sort(chars);
                    System.out.println("Sorted string: " + new String(chars));
                    break;
                }
                case 3:
                    {
                        String reversed = new StringBuilder(input).reverse().toString();
                        System.out.println("Reversed string: " + reversed);
                        break;
                    }
                case 4:
                    {
                        String reversed = new StringBuilder(input).reverse().toString();
                        System.out.println("Concatenated string: " + input + reversed);
                        break;
                    }
                case 5:
                    break OUTER;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        
        sc.close();
    }
}
