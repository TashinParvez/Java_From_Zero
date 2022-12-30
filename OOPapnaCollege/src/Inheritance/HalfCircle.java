package Inheritance;

public class HalfCircle extends Circle {
    @Override
    public void getArea() {
        super.radious = radious / 2;
        super.getArea();
    }
}