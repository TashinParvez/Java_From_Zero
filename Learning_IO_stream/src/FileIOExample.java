import java.io.*;

public class FileIOExample {
    public static void main(String[] args) {
        String fileName = "this_is_a_test.txt"; // File name
        String filePath = System.getProperty("user.dir") + File.separator + fileName; // File path in project directory
        String destinationPath = ""; // Destination path for copied file
        String os = System.getProperty("os.name"); // Operating system name

        if (os.startsWith("Windows")) {
            destinationPath = System.getProperty("user.home") + File.separator + "Documents" + File.separator + fileName;
        } else if (os.startsWith("Linux") || os.startsWith("Mac")) {
            destinationPath = System.getProperty("user.home") + File.separator + "Documents" + File.separator + "document" + File.separator + fileName;
        }

        try {
            // Create a new file in write mode
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Write the line "This is the best course ever" 10 times to the file
            for (int i = 1; i <= 10; i++) {
                bufferedWriter.write("This is the best course ever");
                bufferedWriter.newLine();
            }

            // Close the writer
            bufferedWriter.close();

            // Create a buffer to read the file in chunks of 256 bytes
            byte[] buffer = new byte[256];

            // Create a file input stream to read the file
            FileInputStream fileInputStream = new FileInputStream(filePath);

            // Create a file output stream to write the copied contents to the new file
            FileOutputStream fileOutputStream = new FileOutputStream(destinationPath);

            // Copy the contents of the file using chunking
            int bytesRead;
            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, bytesRead);
            }

            // Close the input stream and output stream
            fileInputStream.close();
            fileOutputStream.close();

            System.out.println("File copied successfully to: " + destinationPath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
