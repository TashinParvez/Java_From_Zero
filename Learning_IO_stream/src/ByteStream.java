import java.io.*;

public class ByteStream {
    public static void main(String[] args) throws IOException {
        FileInputStream inStream = null;
        FileOutputStream outputStream = null;

        inStream = new FileInputStream("D:\\JAVA Journey\\Learning_IO_stream\\src\\Tashin.txt");
        outputStream = new FileOutputStream("D:\\JAVA Journey\\Learning_IO_stream\\src\\OUT.txt");
        int contain;
        while ((contain = inStream.read())!=-1)
        {
            outputStream.write((byte) contain);

        }

        inStream.close();
        outputStream.close();

    }
}
