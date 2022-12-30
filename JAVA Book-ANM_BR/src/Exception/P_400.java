package Exception;

public class P_400 {
    public static void main(String[] args) {
        try {
            int number[] = new int[10];
            number[15] = 30 / 0;
        } catch (Exception e) {

            if (e instanceof ArithmeticException)
                System.out.println("You can't divide something by 0");
            else if (e instanceof ArrayIndexOutOfBoundsException) {
                System.out.println("Index is out of Bound");
            }
        }

    }
}
