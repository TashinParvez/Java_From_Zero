import java.nio.file.FileAlreadyExistsException;
import java.sql.SQLOutput;

public class Exception {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        try{
            try{
                int a = 1500;
                String s = new String("abc");
                System.out.println(s.charAt(4));
            }
            catch (ArithmeticException e)
            {
                System.out.println("a");
            }
        }
        catch (Exception e)
        {
            System.out.println("b = "+ e);
        }

    }
}