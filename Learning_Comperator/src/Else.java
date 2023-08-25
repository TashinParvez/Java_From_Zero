import java.io.*;

public class Else {
    public static void main(String[] args) {

        // C:\Users\Tashin Parvez\Desktop
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Tashin Parvez\\Desktop\\txe.txt"));
            BufferedWriter write = new BufferedWriter(new FileWriter("C:\\Users\\Tashin Parvez\\Desktop\\even.txt",true));
            String str;
            while ((str = reader.readLine()) != null) {
                int a = Integer.parseInt(str);
                if (a % 2 == 0) {
                    write.write(a + "\n");
                }
            }


            reader.close();
            write.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
