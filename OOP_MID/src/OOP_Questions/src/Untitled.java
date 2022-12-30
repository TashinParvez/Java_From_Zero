public class Untitled {
    public static void main(String[] args) {
        double[] arr = new double[8];
        arr[0] = 10.1;
        arr[1] = 1.1;
        arr[2] = 9.1;
        arr[3] = 9.11;
        arr[4] = 11.1;
        arr[5] = 24.1;
        arr[6] = 134.1;
        arr[7] = 15.1;
        double sum = 0;
        for (double a : arr) {
            if (a < 10.0)
                sum += a;
        }
        int size = 0;
        for (double a : arr) {
            size++;
        }

        //    System.out.println("SIZE "+ size);
        //   System.out.println("Sum "+sum);


    }
}
