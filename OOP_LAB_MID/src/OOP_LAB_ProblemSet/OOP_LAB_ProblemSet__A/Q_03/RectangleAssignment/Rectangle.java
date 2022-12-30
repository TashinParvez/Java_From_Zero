package OOP_LAB_ProblemSet.OOP_LAB_ProblemSet__A.Q_03.RectangleAssignment;

public class Rectangle {
    double  length, width, perimeter, area;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        area = length * width;
        return area;
    }

    public double calculatePerimeter() {
        perimeter = (2 * length) + (2 * width);
        return perimeter;
    }
}
