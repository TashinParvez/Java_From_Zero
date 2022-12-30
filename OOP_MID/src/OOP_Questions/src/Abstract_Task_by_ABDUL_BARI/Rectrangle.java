package Abstract_Task_by_ABDUL_BARI;

public class Rectrangle extends Shape {
    double length;
    double breadth;

    @Override
    void area() {
        System.out.println("Area of this Rectangle " + length * breadth);
    }

    @Override
    void parametter() {
        System.out.println("Parametter of this Rectangle " + 2 * (length + breadth));
    }
}
