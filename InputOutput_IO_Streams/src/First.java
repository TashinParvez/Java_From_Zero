import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        File myFile = new File("D:\\JAVA Journey\\InputOutput_IO_Streams\\CreatFile.txt");
        try {
            if (myFile.createNewFile()) {
                System.out.println("File created.");
            } else {
                System.out.println("File already exist.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("File name :" + myFile.getName());
        System.out.println("File path :" + myFile.getAbsolutePath());
        System.out.println("Write? :" + myFile.canWrite());
        System.out.println("Read? : " + myFile.canRead());
        System.out.println("Length : " + myFile.length());

        //__________________________ Write in a File _________________________________


//        try {
//            //    FileWriter myWriter = new FileWriter("D:\\JAVA Journey\\InputOutput_IO_Streams\\CreatFile.txt");
//            FileWriter myWriter = new FileWriter(myFile);
//
//            myWriter.write("This is just written now");
//            myWriter.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


        //__________________________ Read from a File _________________________________
        try {
            //   FileReader myReader = new FileReader("D:\\JAVA Journey\\InputOutput_IO_Streams\\CreatFile.txt");
            Scanner myReader = new Scanner(myFile);
            String data;
            
            while (myReader.hasNext()) {
                data = myReader.nextLine();
                System.out.println("\n" + data);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
