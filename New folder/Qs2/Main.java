package sectionA.Qs2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Player> playerList = new ArrayList<>();
        int n;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\3rd Semester\\OOP Lab" +
                    "\\Practice\\Practice for Final\\Practice for Final\\src\\sectionA\\Qs2\\Player.txt"));

            String str;
            int i = 0;
            while ((str = reader.readLine()) != null) {
                if (i == 0) {
                    n = parseInt(str);
                    i = 1;
                } else {
                    String[] playerInfo = new String[4];
                    playerInfo = str.split(" ");
                    playerList.add(new Player(parseInt(playerInfo[0]), parseDouble(playerInfo[1])
                            , parseInt(playerInfo[2]), playerInfo[3]));
                }
            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        int m = sc.nextInt();
        for (Player p : playerList) {
            if (p.jerseyNumber == m) {
                p.show(p);
            }
        }

        Collections.sort(playerList, new nameComparator());

        Iterator itr = playerList.iterator();

        while (itr.hasNext()) {
            Player s = (Player) itr.next();
            s.show(s);
        }
    }
}
