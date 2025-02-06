import java.util.Scanner;

public class MatrixValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows in the matrix: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns in the matrix: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");

        // Taking matrix input from the user
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Validate the matrix
        if (isValidMatrix(matrix, rows, cols)) {
            System.out.println("The entered array is a valid matrix.");
        } else {
            System.out.println("The entered array is NOT a valid matrix.");
        }

        scanner.close();
    }

    public static boolean isValidMatrix(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            if (matrix[i].length != cols) {
                return false;
            }
        }
        return true;
    }
}
