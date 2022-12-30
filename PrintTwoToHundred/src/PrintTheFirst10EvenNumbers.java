public class PrintTheFirst10EvenNumbers {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 1; count <= 10; i++)
            if (i % 2 == 0) {
                System.out.println(i);
                count++;
            }
    }
}
