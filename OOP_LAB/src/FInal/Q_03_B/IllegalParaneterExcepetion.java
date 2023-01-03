package FInal.Q_03_B;

public class IllegalParaneterExcepetion extends Exception {
    IllegalParaneterExcepetion() {
    }

    @Override
    public String toString() {
        return "Input number is negative";
    }
}
