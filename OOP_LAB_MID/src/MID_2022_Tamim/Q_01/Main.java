package MID_2022_Tamim.Q_01;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter array size : ");
        int arraySize = sc.nextInt();
        C2[] obj = new C2[arraySize];
        for (C2 o : obj) {
            System.out.println("Enter uName, uID, uBalance, numberOfElements");
            o = new C2(sc.nextLine(),sc.next().charAt(0), sc.nextLine(),sc.next().charAt(0), sc.nextDouble(), sc.nextInt());
        }
        int minNumber = obj[0].getNumberOfElements();
        int i, j = 0;
        for (i = 0; i < arraySize; i++) {
            if (minNumber > obj[i].getNumberOfElements()) {
                minNumber = obj[i].getNumberOfElements();
                j = i;
            }
        }
        System.out.println("Name of the less number of elements " + obj[j].uName);
    }
}
