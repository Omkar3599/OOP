import java.util.Scanner;
// CustomException.java
 class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}


public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a positive number: ");
            int number = scanner.nextInt();

            if (number < 0) {
                throw new CustomException("Error: Negative numbers are not allowed!");
            }

            System.out.println("You entered: " + number);

        } catch (CustomException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
