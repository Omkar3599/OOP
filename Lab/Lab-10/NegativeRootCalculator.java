import java.util.Scanner;

public class NegativeRootCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        double number = scanner.nextDouble();

        if (number < 0) {
            System.out.println("Error: Negative numbers do not have real square roots.");
        } else {
            double negativeRoot = -Math.sqrt(number);
            System.out.println("The negative root of " + number + " is: " + negativeRoot);
        }

        scanner.close();
    }
}