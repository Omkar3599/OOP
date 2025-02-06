 class Accounts {
    protected String name;
    protected String accountNumber;
    protected String accountType;
    protected double balance;

    public Accounts(String name, String accountNumber, String accountType) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Rs" + amount + ". New balance is Rs" + balance + ".");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew Rs" + amount + ". New balance is Rs" + balance + ".");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Accounts balance is Rs" + balance + ".");
    }

   
    public void computeInterest() {
      
    }

    public void checkMinBalance() {
        
    }

    public void imposePenalty() {
    }
}
 class CurrentAccount extends Accounts {
    private static final double MIN_BALANCE = 1000.0;
    private static final double PENALTY = 50.0;

    public CurrentAccount(String name, String accountNumber) {
        super(name, accountNumber, "Current");
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        checkMinBalance();
    }

    @Override
    public void checkMinBalance() {
        if (balance < MIN_BALANCE) {
            imposePenalty();
        }
    }

    @Override
    public void imposePenalty() {
        balance -= PENALTY;
        System.out.println("Penalty of Rs" + PENALTY + " imposed. New balance is Rs" + balance + ".");
    }
}
 class SavingsAccount extends Accounts {
    private static final double INTEREST_RATE = 0.04; // 4% interest rate

    public SavingsAccount(String name, String accountNumber) {
        super(name, accountNumber, "Savings");
    }

    @Override
    public void computeInterest() {
        double interest = balance * INTEREST_RATE;
        deposit(interest);
        System.out.println("Interest of Rs" + interest + " deposited. New balance is Rs" + balance + ".");
    }
}
 public class Account {
    public static void main(String[] args) {
        // Create a Current Accounts
        CurrentAccount currAcc = new CurrentAccount("John Doe", "123456");
        currAcc.deposit(11500);
        currAcc.withdraw(1600);
        currAcc.displayBalance();
        
        // Create a Savings Accounts
        SavingsAccount savAcc = new SavingsAccount("Jane Doe", "654321");
        savAcc.deposit(20000);
        savAcc.computeInterest();
        savAcc.withdraw(5000);
        savAcc.displayBalance();
    }
}
