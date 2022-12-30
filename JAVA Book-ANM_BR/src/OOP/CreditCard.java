package OOP;

public class CreditCard {
    private final long number;
    private final int cvv;
    private final String validthrough;

    public CreditCard(long number, int cvv, String validthrough) {
        this.cvv = cvv;
        this.number = number;
        this.validthrough = validthrough;
    }
}
