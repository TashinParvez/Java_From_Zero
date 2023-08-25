package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<student> a1 = new ArrayList<student>();
        a1.add(new student("Limon", 90));
        a1.add(new student("Tashin", 22));
        a1.add(new student("Tuhin", 21));

        Collections.sort(a1, new ageComperator());

        for (student s : a1) {
            System.out.println(s.toString());
        }


    }
}
