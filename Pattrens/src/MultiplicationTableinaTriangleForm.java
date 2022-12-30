public class MultiplicationTableinaTriangleForm {
    //18
    static public void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i <= n; i++) // line
        {
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
