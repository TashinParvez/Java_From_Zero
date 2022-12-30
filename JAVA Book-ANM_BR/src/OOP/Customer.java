package OOP;

public class Customer {
    private String name;
    private CreditCard creditCard;

    public Customer(String name, long number, int cvv, String validthrough) {
        this.name = name;
        this.creditCard = new CreditCard(number, cvv, validthrough);
    }

    Customer(String name, CreditCard creditCard) {
        this.name = name;
        this.creditCard = creditCard;
    }
}
