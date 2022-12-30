import static java.lang.Math.log;

public class integerBits {
    public static void main(String[] args)
    {
        int n=100;
        double length=Math.log10(n);

        int totalDigits = (int) log10*(n+ 1);

        System.out.println(length);
    }
}
