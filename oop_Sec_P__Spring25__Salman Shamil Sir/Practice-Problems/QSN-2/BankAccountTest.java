public class BankAccountTest {
    public static void main(String[] args) {
        // Creating a bank account with account number "ACC-001"
        BankAccount acc1 = new BankAccount("ACC-001");

        // Depositing $500
        acc1.deposit(500.0);

        // Withdrawing $200
        acc1.withdraw(200.0);
        System.out.println("Balance: $" + acc1.getBalance()); // Expected output: 300.0

        // Trying to withdraw $400 (should fail due to insufficient funds)
        acc1.withdraw(400.0);
        System.out.println("Balance: $" + acc1.getBalance()); // Expected output: 300.0
    }
}
