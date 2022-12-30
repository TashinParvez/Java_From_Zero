package Tonni_assignment_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Q_01 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.nextLine();

//        ArrayList<String> words;
//        ArrayList<String> words = new ArrayList<>(List.of(str.split(" ")));

        String[] array = str.split(" ");
        int length = array.length;

        for (int i = length-1; i >=0; i--) {
            System.out.print(array[i] + " ");
        }


        try {
            BufferedReader n = new BufferedReader(new FileReader("tct.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
