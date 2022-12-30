package OOP_MID_SUMMER_22.Question_NO__05__B;

public class Rectangle extends Shape{
    double width, height;
    public Rectangle(double width, double
            height)
    {
        this.width = width;
        this.height = height;
    }
    public void printArea(){
        double area = width * height;
        System.out.println("Area: " + area      + "      rec");
    }
}
