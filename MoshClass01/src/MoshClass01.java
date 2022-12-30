import java.util.Arrays;
import java.util.Scanner;


public class MoshClass01 {
    public static void main(String[] args) {

        int a;
        a = 19_12;
        // System.out.println("a"+"a"); // sout

        String hW = "Hello" + " World";

        String hi = " This is Java ";

        String h = "Hello" + hi;
        //  System.out.println(hW);


        String ch = "   TASHIN    PARVEZ   ";
        // System.out.println(ch.indexOf("AS"));
        // System.out.println(ch.length());

        // System.out.println(ch.replace("PARVEZ","Hi"));
        // System.out.println(ch.length());

        // System.out.println(ch.toLowerCase());
        // System.out.println(ch.toUpperCase());

        // System.out.println(ch);
        // System.out.println(ch.trim());

        //  array
        int[] numbers = {0, 1, 2, 3, 4, 5};
        // System.out.println(Arrays.toString(numbers));

        float result = (float) 10 / 3;
        // System.out.println(result);

        String name = "Tashin";
        // System.out.println(name.startsWith("T"));
        // System.out.println(name.substring(0,2));

        int[] arrayOfMarks = new int[3];
        arrayOfMarks[0] = 99;
        arrayOfMarks[1] = 90;
        arrayOfMarks[2] = 98;
        //  System.out.println(arrayOfMarks[0]);

        Arrays.sort(arrayOfMarks);
        //  System.out.println(arrayOfMarks[0]);


        int[][] cg = {{1, 2, 4}, {1, 2, 4}};
        // System.out.println(Arrays.deepToString(cg));


        String id = "011221437.0";
        int x = (int) Double.parseDouble(id) + 2;
        // System.out.println("\n" + x);

        final float PI = 3.1416F;
        // PI=10;

        double v = Math.floor(1.99999F);
        // System.out.println(v);

        int ran = (int) Math.ceil(Math.random() * 100);
        // System.out.println(ran);


        // Taking input + IF else condition

        Scanner sc = new Scanner(System.in);
        //  System.out.print("Enter a Num: ");
        //  int num1=sc.nextInt();
        //  System.out.print("Enter another num: ");
        //  int num2=sc.nextInt();

        //  if(num1==num2)
        // System.out.println("True");
        //   else
        // System.out.println("False");


//        int age = sc.nextInt();
//        if (age >= 18)
//            System.out.println("Adult");
//        else
//            System.out.println("NOT adult");


        String userName= "Tashin";
       // if(userName=="Tashin")
           // System.out.println("Yes");






    }
}
