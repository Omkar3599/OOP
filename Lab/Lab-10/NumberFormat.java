import java.util.Scanner;

public class NumberFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        String a = sc.nextLine();
        try {
            int num = Integer.parseInt(a);
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            
        }
        finally{
                sc.close();
        }
        
    }
    
}
