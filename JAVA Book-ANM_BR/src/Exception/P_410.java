package Exception;

public class P_410 {
    public static void main(String[] args) {
        int a = 10;
        try {
            a = a / 0;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("-------------------------");

            System.out.println(e.getMessage());
            System.out.println("-------------------------");

            System.out.println(e.toString());
            System.out.println("-------------------------");
            System.out.println(e);


        } finally {
            System.out.println("---------End of the program----------");

        }

    }
}
