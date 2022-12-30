package OOP_MID_SUMMER_22.Question_NO__05__B;

public class Main {
    public static void main(String[] args) {
        Shape sh1, sh2;
        Rectangle r1;
        Square s1;

        sh1 = new Square(10.0);

        sh2 = new Rectangle(10, 20);
        s1 = new Square(5);

        r1 = new Rectangle(5, 10);
        r1.printArea();
        s1.printArea();

        sh1.printArea();
        sh2.printArea();
    }
}
