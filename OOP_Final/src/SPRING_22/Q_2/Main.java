package SPRING_22.Q_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader read = new BufferedReader(new FileReader("D:\\JAVA Journey\\OOP_Final\\src\\SPRING_22\\Q_2\\id.txt"));
            PrintWriter odd = new PrintWriter(new FileWriter("odd.txt", true));
            PrintWriter even = new PrintWriter(new FileWriter("even.txt", true));
            String str;



            while ((str = read.readLine()) != null) {
                int num = Integer.parseInt(str);
                System.out.println(num);

                if (num % 2 == 0)
                    odd.write(num + "");
                  //  odd.println(num + "");
                else
                    even.println(num + "");
            }
            read.close();
            odd.close();
            even.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
