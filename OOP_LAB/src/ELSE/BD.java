package ELSE;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BD {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\JAVA Journey\\OOP_LAB\\src\\ELSE\\tas.txt"));
            int num;
            String str;
            while ((str = (reader.readLine())) != null) {
                num = Integer.parseInt(str);
                if (num > 500 && num < 700) {
                    System.out.println(num);
                    break;
                }
            }
            reader.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
