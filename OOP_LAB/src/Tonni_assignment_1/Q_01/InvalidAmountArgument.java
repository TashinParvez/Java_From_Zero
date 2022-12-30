package Tonni_assignment_1.Q_01;

public class InvalidAmountArgument extends Exception {
    public InvalidAmountArgument(double negativeAmount) {
        System.out.println("you enterd a negative amount");
        System.out.println("Invalid Amount Value  " + negativeAmount + " Amount can’t be negative.");
    }
}
