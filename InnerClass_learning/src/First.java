public class First {
    public static void main(String[] args) {
        int x = 10;
        class Inner{
            void display()
            {
                int y = 19;
                System.out.println("x+y = " + (x + y));
            }
        }
        Inner obj = new Inner();
        obj.display();
    }
}
