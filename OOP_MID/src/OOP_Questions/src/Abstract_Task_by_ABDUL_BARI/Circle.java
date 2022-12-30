package Abstract_Task_by_ABDUL_BARI;

public class Circle extends  Shape{
double radius;
Circle (double redius )
{
    this.radius = radius;
}

    @Override
    void area() {
        System.out.println("Area of this Circle "+ Math.pow(radius,2)*super.PI);
    }

    @Override
    void parametter() {

        System.out.println("Parametter of this Circle "+ (radius*2)*super.PI);
    }

}
