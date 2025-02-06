import java.util.Scanner;
public class ArrayOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5]; // An array of size 5

        System.out.println("You can enter up to 5 numbers:");

        for (int i = 0; i < 7; i++) { // Intentionally going beyond the array size
            try {
                System.out.print("Enter number " + (i + 1) + ": ");
                numbers[i] = scanner.nextInt(); // This line can throw ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                // Handle the exception
                System.out.println("Array overflow! You can only enter up to " + numbers.length + " numbers.");
                break; // Exit the loop when the exception occurs
            } catch (Exception e) {
                // Handle other exceptions, like input mismatch
                System.out.println("Invalid input! Please enter an integer.");
                scanner.next(); // Clear the invalid input
            }
        }

        System.out.println("You entered the following numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        scanner.close();
    }
}


