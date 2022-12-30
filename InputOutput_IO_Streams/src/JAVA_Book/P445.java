package JAVA_Book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P445 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Start Typing");
        String line;
        do {
            try {
                line = reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(">>" + line.toUpperCase());

        } while (!"quit".equals(line));
    }
}
