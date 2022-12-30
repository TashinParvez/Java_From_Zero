import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {
    public static void main(String[] args) {
        String str;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\JAVA Journey\\InputOutput_IO_Streams\\Output.txt"));
            while ((str = reader.readLine()) != null) {
                System.out.println(str);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}