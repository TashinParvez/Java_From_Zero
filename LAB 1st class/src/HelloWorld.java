public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int a = 10, b = 10;
        for (int i = 1; i <= 500; i++)
            if (i % 10 == 3 || i % 10 == 7)
                System.out.println(i);
    }
}