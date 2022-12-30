public class ArrayOutOfBound {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 0};

        try {
            int c = array[0] / array[2];
            System.out.println("C = " + c);
            try {
                System.out.println(array[10]);
            } catch (ArrayIndexOutOfBoundsException aIB) {
                System.out.println(aIB);
            }
        } catch (ArithmeticException ar) {
            System.out.println(ar);
        } finally {
            System.out.println("program end");
        }

    }
}
