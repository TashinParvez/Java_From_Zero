package CT3;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\JAVA Journey\\OOP_LAB_MID\\src\\CT3\\deanslist.txt"));
            BufferedReader reader = new BufferedReader(new FileReader("D:\\JAVA Journey\\OOP_LAB_MID\\src\\CT3\\students.txt"));
            String name;
            while ((name= reader.readLine())!=null)
            {
                double cgpa = Double.parseDouble(reader.readLine());
                if(cgpa>3.67)
                {
                    writer.write(name+"\n");
                    writer.write(cgpa + "\n");
                }
            }
            reader.close();
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
