public class Mid implements Test {
    @Override
    public void sum(int a, int b) {
        System.out.println(a + b);
    }

    @Override
    public void division(int a, int b) {
        System.out.println(a / b);
    }

    @Override
    public void multiply() {
        System.out.println("noting input");
    }

    public void multiply(int a, int b) {
        System.out.println(a * b);
    }

}
