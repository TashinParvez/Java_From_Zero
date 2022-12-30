public class Important_2 {
    public static void main(String[] args) {
        System.out.println(returnMethod());
    }

    static int returnMethod() {
        try {
            System.out.println("This is try Block");
            return 4;
        } catch (Exception e) {
            return 5;
        } finally {
            System.out.println("This is finally block");
            return 6;
        }
    }
}

