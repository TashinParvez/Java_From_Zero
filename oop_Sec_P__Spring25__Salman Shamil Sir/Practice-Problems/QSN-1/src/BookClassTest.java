public class BookClassTest {
    public static void main(String[] args) {
        // Test case for Book class

        // Creating book1 using the parameterized constructor
        Book book1 = new Book("The Alchemist", "Paulo Coelho", 12.99);

        // Creating book2 using the default constructor and then assigning values
        Book book2 = new Book();
        book2.title = "1984";
        book2.author = "George Orwell";
        book2.price = 9.99;

        // Updating the price of book1
        book1.updatePrice(10.50);

        // Displaying details for book1
        System.out.println("Book 1 Details:");
        book1.displayDetails();
        System.out.println();  // Blank line for separation

        // Displaying details for book2
        System.out.println("Book 2 Details:");
        book2.displayDetails();
    }
}
