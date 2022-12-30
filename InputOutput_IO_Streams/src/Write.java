import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args) {

        String[] names = {"tashin", "mushfiq", "noman", "liza", "piyal"};

        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter("Output.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\JAVA Journey\\Text Files\\Input1.txt"));

//            writer.write("Tashin Parvez\n");
//            writer.write("Here is another Line");
            for (String name : names) {
                writer.write(name + "\n");
            }

            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}