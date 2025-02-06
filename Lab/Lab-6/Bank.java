 class Banks {
    // Method to get the rate of interest. To be overridden in subclasses.
    public double getRateOfInterest() {
        return 0.0; // Default rate if not overridden
    }

    // Method to calculate interest based on the principal and time period
    public double calculateInterest(double principal, int years) {
        return (principal * getRateOfInterest() * years) / 100;
    }
}
 class SBI extends Banks {
    @Override
    public double getRateOfInterest() {
        return 8.0; // SBI's rate of interest
    }
}
 class ICICI extends Banks {
    @Override
    public double getRateOfInterest() {
        return 7.0; // ICICI's rate of interest
    }
}
 class AXIS extends Banks {
    @Override
    public double getRateOfInterest() {
        return 9.0; // AXIS's rate of interest
    }
}
 public class Bank {
    public static void main(String[] args) {
        // Create instances of each bank
        Banks sbi = new SBI();
        Banks icici = new ICICI();
        Banks axis = new AXIS();

        // Principal amount and time period for interest calculation
        double principal = 10000.0;
        int years = 5;

        // Calculate and display interest for each bank
        System.out.println("Interest for SBI: Rs" + sbi.calculateInterest(principal, years));
        System.out.println("Interest for ICICI: Rs" + icici.calculateInterest(principal, years));
        System.out.println("Interest for AXIS: Rs" + axis.calculateInterest(principal, years));
    }
}
