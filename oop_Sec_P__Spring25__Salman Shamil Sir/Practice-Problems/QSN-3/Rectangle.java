public class Rectangle {
    // Attributes
    private int length;
    private int width;

    // Default constructor (sets length = 1, width = 1)
    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    // Constructor with one parameter (sets length and width to the same value)
    public Rectangle(int size) {
        this.length = size;
        this.width = size;
    }

    // Constructor with two parameters (sets length and width)
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate and return the area
    public int calculateArea() {
        return length * width;
    }
}
