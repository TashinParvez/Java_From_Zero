package Exception.Exersise;

public class EX_01 {
    public static void main(String[] args) {
        try {
            int i = 5;
            if (i < 10) {
                throw new Exception("Value is too Small");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
