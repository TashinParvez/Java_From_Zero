package Tonni_assignment_1.Q_01;

public class InsufficientBalance extends Exception {
    public InsufficientBalance(double balance, double withdrawAmount) {
        System.out.println("Insufficient Balance. Current balance " + balance + " is lower than the withdrawal amount " + withdrawAmount + " ");
    }
}
