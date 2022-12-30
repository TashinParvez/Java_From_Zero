public class Test
{
    static int numberOfPrint;
    Test()  // constructor
    {
        numberOfPrint=0;
    }
    static void print()
    {
        numberOfPrint++;
    }
    public static void main(String[] args) {

        Test t = new Test();
       print();
        System.out.println(numberOfPrint); // 1

        Test t2 = new Test();
        print();
        System.out.println(numberOfPrint); // 1

    }
}