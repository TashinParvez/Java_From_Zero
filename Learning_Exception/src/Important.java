public class Important {
    public static void main(String[] args) {
        System.out.println(returnMethod());
    }

    static int returnMethod() {
        try {
            return 4;
        } catch (Exception e) {
            return 5;
        } finally {
            return 6;
        }
    }
}
