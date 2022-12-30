package OOP_LAB_ProblemSet.OOP_LAB_ProblemSet__A.Q_02;

public class Shape {
    double height,length,base, radius;
    Shape(double height,double length,double base,double radius)
    {
        this.height = height;
        this.base = base;
        this.length = length;
        this.radius = radius;
    }
    double Volume() // rectangle
    {
        return length * length;
    }
}