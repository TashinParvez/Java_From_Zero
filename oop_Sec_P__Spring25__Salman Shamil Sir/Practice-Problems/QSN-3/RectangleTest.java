public class RectangleTest {
    public static void main(String[] args) {
        // Creating Rectangle objects using different constructors
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(5);
        Rectangle rect3 = new Rectangle(4, 6);

        // Printing the area of each rectangle
        System.out.println(rect1.calculateArea()); // Output: 1
        System.out.println(rect2.calculateArea()); // Output: 25
        System.out.println(rect3.calculateArea()); // Output: 24
    }
}
