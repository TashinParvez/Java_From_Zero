public class DifferentMethodsCall {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void method1() {
        method2();
    }

    static void method2() {
        int t = 0;
        t = method3(10, 0);
    }

    static int method3(int a, int b) {
        return a / b;
    }
}