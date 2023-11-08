package Summer_22;

public class Q_1_B {
}

interface I1 {
    void method1();

    void method2();
}

class imp implements I1 {
    @Override
    public void method1() {
        System.out.println("Method 1 implemented here");
    }
    @Override
    public void method2() {
        method1 ();
    }
}
