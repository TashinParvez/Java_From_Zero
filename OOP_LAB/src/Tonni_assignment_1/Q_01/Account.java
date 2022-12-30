package Tonni_assignment_1.Q_01;

public class Account {
    String name;
    double balance = 0;

    void withdraw(double withdrawAmount) throws InsufficientBalance, InvalidAmountArgument {
        if (withdrawAmount < 0) {
            throw new InvalidAmountArgument(withdrawAmount);
        } else if (balance > withdrawAmount)
            balance -= withdrawAmount;
        else {
            throw new InsufficientBalance(balance,withdrawAmount);
        }
    }

    void deposit(double depositAmount) throws InvalidAmountArgument {
        if (depositAmount < 0) {
            throw new InvalidAmountArgument(depositAmount);
        } else {
            balance += depositAmount;
        }
    }
}
