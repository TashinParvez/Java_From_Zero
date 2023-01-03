package FInal.Q_02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
            int n = Integer.parseInt(reader.readLine());
            for (int i = 0; i < n; i++) {
                String str = reader.readLine();
                String[] array = str.split(" ");
                players.add(new Player(Integer.parseInt(array[0]), Integer.parseInt(array[1]), Integer.parseInt(array[2]), (array[3])));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Enter a Jeasrsy Number: ");
        int number = sc.nextInt();
        for (Player p : players) {
            if (p.jearsy_number == number) {
                System.out.println("jearsy_number " + p.jearsy_number + "\nSalary " + p.Salary + "\nage " + p.age + "\nname " + p.name);
            }

        }


    }
}
