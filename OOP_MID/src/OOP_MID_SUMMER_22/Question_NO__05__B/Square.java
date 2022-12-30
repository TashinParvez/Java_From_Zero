package OOP_MID_SUMMER_22.Question_NO__05__B;

public class Square extends Shape{
    double side;

    public Square(double side) {
        this.side = side;
    }

    public void printArea() {
        double area = side * side;
        System.out.println("Area " + area   + "      sqr");
    }
}
