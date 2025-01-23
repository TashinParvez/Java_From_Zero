public class Sum {

    static int add(int a, int b)
    {
        return a+b;
    }

    static double add(double a, double b)
    {
        return a+b;
    }

    static double add(int a,int b,int c)
    {
        return a+b+c;
    }

    static double add(double a,double b,double c)
    {
        return a+b+c;
    }

    public static void main(String[] args) {

        System.out.println("The Sum = "+add(3,5.44,7));
    }
}
