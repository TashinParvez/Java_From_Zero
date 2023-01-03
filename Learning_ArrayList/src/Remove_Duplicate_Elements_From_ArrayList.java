import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Remove_Duplicate_Elements_From_ArrayList {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter 10 integers");
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < 10) {
            list.add(sc.nextInt());
            i++;
        }
        System.out.println(list);
        Collections.sort(list);

        for (int ii = 0; ii < list.size(); ii++) {
            if (ii + 1 < list.size()) {
                if (list.get(ii).equals(list.get(ii + 1))) {
                    list.remove((ii + 1));
                    ii--;
                }
            }
        }
        System.out.println(list);

        // 10 10 12 133 12 123 12 11 1 2

//        list.clear();
//        int in = list.indexOf(10);
//        System.out.println(in);


        System.out.println(list);


    }
}
