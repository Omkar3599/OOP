import java.util.Scanner;

public class StringMenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string:");
        String str2 = sc.nextLine();
        
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Compare two strings");
            System.out.println("2. Convert case of characters");
            System.out.println("3. Check if one string is a substring of the other");
            System.out.println("4. Replace substring");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice) {
                case 1:
                    System.out.println("Strings are equal: " + str1.equals(str2));
                    break;
                case 2:
                    StringBuilder converted = new StringBuilder();
                    for (char c : str1.toCharArray()) {
                        if (Character.isUpperCase(c)) {
                            converted.append(Character.toLowerCase(c));
                        } else {
                            converted.append(Character.toUpperCase(c));
                        }
                    }
                    System.out.println("Converted string: " + converted.toString());
                    break;
                case 3:
                    boolean isSubstring = str1.contains(str2) || str2.contains(str1);
                    System.out.println("One string is a substring of the other: " + isSubstring);
                    break;
                case 4:
                    
                    if (str1.contains(str2) ) {
                        String result = str1.replace(str2, "Hello");
                        System.out.println("Modified string: " + result);
                    }                      
                    else if (str2.contains(str1) ) {
                            String result = str2.replace(str1, "Hello");
                            System.out.println("Modified string: " + result);
                            
                    } else {
                        System.out.println("No substring found to replace.");
                    }
                    break;
                case 5:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
