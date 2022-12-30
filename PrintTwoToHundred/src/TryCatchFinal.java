public class TryCatchFinal {
    public static void main(String[] args) {
        int[] arr = new int[10];

        try {
            for (int i = 0; i <= 66; i++) {
                arr[i] = i;
            }

        } catch (Exception unknown) {
            unknown.printStackTrace();
        }

// printing
        for (int i = 0; i <= 9; i++) {
            System.out.println("arr[" + i + "}= " + arr[i]);
        }

    }
}
