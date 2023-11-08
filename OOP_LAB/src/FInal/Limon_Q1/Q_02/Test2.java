package FInal.Limon_Q1.Q_02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

class Player {
    int jerset_Number;
    double Salary;
    int age;
    String name;

    Player(int jerset_Number, double salary, int age, String name, String country) {
        this.jerset_Number = jerset_Number;
        this.Salary = salary;
        this.age = age;
        this.name = name;
    }

    public Player(int jerset_Number, double salary, int age, String name) {
        this.jerset_Number = jerset_Number;
        Salary = salary;
        this.age = age;
        this.name = name;
    }
}

public class Test2 {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\Users\\student\\Desktop\\Lab Final\\src\\inp1.txt");
            BufferedReader br = new BufferedReader(new FileReader(f));

            int n = Integer.parseInt(br.readLine());


            HashMap<Integer, Player> p = new HashMap<>();

            String s;

            while ((s = br.readLine()) != null) {
                String[] split = s.split(" ");
                p.put(Integer.parseInt(split[0]), new Player(Integer.parseInt(split[0]), Double.parseDouble(split[1]), Integer.parseInt(split[2]), split[3]));
            }
            br.close();

            Scanner in = new Scanner(System.in);
            System.out.println("Enter a player's jersey number: ");
            int jersey = in.nextInt();

            if (p.containsKey(jersey)) {
                System.out.println("Player's name: " + p.get(jersey).name);
                System.out.println("Jersey Number: " + p.get(jersey).jerset_Number);
                System.out.println("Salary: " + p.get(jersey).Salary);
                System.out.println("Age : " + p.get(jersey).age);
            } else {
                System.out.println("Player not found");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}