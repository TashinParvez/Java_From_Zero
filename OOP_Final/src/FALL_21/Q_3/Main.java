package FALL_21.Q_3;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        final String inputFile = "D:\\JAVA Journey\\OOP_Final\\src\\FALL_21\\Q_3\\input.txt";
        final String outputFile = "D:\\JAVA Journey\\OOP_Final\\src\\FALL_21\\Q_3\\output.txt";

        FileReader fr = new FileReader(inputFile);
        BufferedReader br = new BufferedReader(fr);

//        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
//        PrintWriter write = new PrintWriter(new FileWriter(outputFile));


        ArrayList<Integer> nums = new ArrayList<>();
        String buff;

        while ((buff = br.readLine()) != null) {
            //  buff = br.readLine();
            nums.add(Integer.parseInt(buff));
        }

        File f = new File(outputFile);
        if (!f.exists()) {
            f.createNewFile();
        }

        int countline = 1;
//        PrintWriter pw = new PrintWriter(outputFile);

        BufferedWriter pw = new BufferedWriter(new FileWriter(outputFile));
        for (int i = 0; i < nums.size() - 1; i += 2) {
            int sum = nums.get(i) + nums.get(i + 1);

            pw.write("Line " + countline + ": " + sum + "\n");
            countline++;
        }

        pw.close();
        br.close();
        fr.close();
    }
}