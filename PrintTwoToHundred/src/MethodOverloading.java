public class MethodOverloading {
    public static void main(String[] args) {
        sum(2, 3);
//        sum(2,3,4);
//        sum(2,3,4,5);
    }

    public static void sum(double x, int y) {
        System.out.println(x + y);
    }

    public static void sum(int x, int y, int z) {
        System.out.println(x + y + z);
    }

    public static void sum(int x, int y, int m, int n) {
        System.out.println(x + y + m + n);
    }
}
