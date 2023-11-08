import java.util.ArrayList;
import java.util.Collections;

public class Recab {
    public static void main(String[] args) {
        ArrayList<Integer> elements = new ArrayList<>();

        elements.add(12);
        elements.add(13);
        elements.add(12);
        elements.add(1, 100);

        System.out.println(elements);

        /* for (Integer i : elements) {
            System.out.println(i);
        }*/

        System.out.println(elements.get(1));

        elements.remove(1);
        System.out.println(elements);

        Collections.sort(elements);

        System.out.println(elements);

        Collections.sort(elements, Collections.reverseOrder());

        System.out.println(elements.contains(12));


    }
}
