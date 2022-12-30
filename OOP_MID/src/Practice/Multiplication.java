package Practice;

public class Multiplication {

    int result(int a, int b) {
        return a * b;
    }

    double result(double a, double b) {
        return a * b;
    }

    double result(double a, int b) {
        return a * b;
    }
}

class Main{
    public static void main(String[] args) {
        Multiplication first = new Multiplication();
        first.result(12,12);
        first.result(12.3,12.2);
        first.result(12.23,12);
    }
}
