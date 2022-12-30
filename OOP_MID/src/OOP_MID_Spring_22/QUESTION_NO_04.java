package OOP_MID_Spring_22;

public class QUESTION_NO_04 {
    public static void main(String[] args) {

    }
}

abstract class GeometricShape {
    double PI = 3.1416;

    abstract double volume();
}

class Sphere extends GeometricShape {
    double radius;

    void Sphere(double radius) {
        this.radius = radius;
    }

    @java.lang.Override
    double volume() {
        return ((double) 4 / 3) * PI * Math.pow(radius, 3);
    }
}

class Cylinder extends GeometricShape {

    double radius;
    double height;

    void Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @java.lang.Override
    double volume() {
        return PI * height * Math.pow(radius, 2);
    }
}
