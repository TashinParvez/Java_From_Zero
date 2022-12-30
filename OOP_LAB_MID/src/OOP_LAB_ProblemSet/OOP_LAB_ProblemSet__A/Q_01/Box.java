package OOP_LAB_ProblemSet.OOP_LAB_ProblemSet__A.Q_01;

public class Box {
    double length,width, height;

    Box(double length,double width,double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    double getVolume()
    {
        return length * width * height;
    }


}
