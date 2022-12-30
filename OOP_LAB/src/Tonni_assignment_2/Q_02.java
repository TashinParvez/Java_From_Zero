package Tonni_assignment_2;

import java.io.*;

public class Q_02 {
    public static void main(String[] args) {
        try {
            BufferedReader reader2 = new BufferedReader(new FileReader("D:\\JAVA Journey\\OOP_LAB\\src\\Tonni_assignment_2\\file.txt"));
            int countLines = 0;
            String str;
            while ((str = reader2.readLine()) != null) {
                countLines++;
            }
            reader2.close();

            String[] lineArray = new String[3];
            int i = 0;

            if (countLines > 3) {
                BufferedReader reader = new BufferedReader(new FileReader("D:\\JAVA Journey\\OOP_LAB\\src\\Tonni_assignment_2\\file.txt"));

                int lineNo = 0;
                while ((str = reader.readLine()) != null) {
                    lineNo++;
                    if (lineNo > countLines - 3) {
                        lineArray[i] = str;
                        i++;
                    }
                }
                reader.close();

                FileWriter writer = (new FileWriter("D:\\JAVA Journey\\OOP_LAB\\src\\Tonni_assignment_2\\file.txt"));
                i = 0;
                while (i < lineArray.length) {
                    writer.write(lineArray[i] +"\n");
                    i++;
                }
                writer.close();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
