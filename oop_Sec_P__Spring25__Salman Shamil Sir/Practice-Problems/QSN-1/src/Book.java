public class Book {
    // Attributes
    String title;
    String author;
    double price;

    // Default constructor (no parameters)
    public Book() {
        // No values set here; they can be assigned later.
    }

    // Parameterized constructor (title, author, price)
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to update the price of the book
    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}
