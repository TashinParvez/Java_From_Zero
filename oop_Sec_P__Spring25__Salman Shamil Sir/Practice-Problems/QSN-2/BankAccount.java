public class BankAccount {
    // Attributes
    private String accountNumber;
    private double balance;

    // Constructor: Initializes accountNumber and sets balance to 0
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    // Method to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}
