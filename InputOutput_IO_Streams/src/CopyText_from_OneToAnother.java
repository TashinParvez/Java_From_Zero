import java.io.*;

public class CopyText_from_OneToAnother {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("D:\\JAVA Journey\\InputOutput_IO_Streams\\Output.txt"));
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter("D:\\JAVA Journey\\InputOutput_IO_Streams\\Input.txt"));

            String str;
            while ((str = reader.readLine()) != null) {  // EOF
                writer.write(str + "\n");
            }

            writer.close();
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
