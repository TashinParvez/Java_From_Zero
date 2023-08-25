import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        // add elements
        al.add(11);
        al.add(12);
        al.add(13);

        // print
        System.out.println(al);

        // get
        System.out.println(al.get(1));

        // add element between
        al.add(1, 100);

        System.out.println(al);

        // set element
        al.set(1, 200);
        System.out.println(al);

        // delete element
        al.remove(2);
        System.out.println(al);


        al.add(400);
        System.out.println(al.get(1));
        System.out.println(al);

        // sorting elements
        Collections.sort(al); // ascending order
        System.out.println(al);

        Collections.sort(al, Collections.reverseOrder()); // sort in descending order
        System.out.println(al);


//        Collections.sort(list, Collections.reverseOrder());


    }
}