package Fall_2021.Question_01;

public class Area {
    private double length;
    private double width;
    Area( double length,double width){
        this.length=length;
        this.width=width;
    }
    double returnArea()
    {
        return length*width;
    }
}
