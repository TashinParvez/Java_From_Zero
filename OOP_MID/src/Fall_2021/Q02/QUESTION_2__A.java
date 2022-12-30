package Fall_2021.Q02;

public class QUESTION_2__A {
}

class AQ {
    double v1;
    int a1;


    public AQ(double v1, int a1) {
        this.v1 = v1;
        this.a1 = a1;
    }

    public AQ() {
        this(100);
    }

    public AQ(int a1) {
        this.a1 = a1;
    }

    void f1(int a, int b) {
        System.out.println(a + b + v1 + a1);
    }

    void f1(double x, double y) {
        System.out.println(x + y + v1 + a1);
    }


}
