package OOP_LAB_ProblemSet.OOP_LAB_ProblemSet__A.Q_03.RectangleAssignment;

public class RectangleAssignment {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(12, 21);
        System.out.println("The area of the rectangle is: " + r.calculateArea()+
                ". The perimeter of the rectangle is:  "+ r.calculatePerimeter());
    }
}