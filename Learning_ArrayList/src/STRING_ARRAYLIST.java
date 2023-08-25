import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class STRING_ARRAYLIST {
    public static void main(String[] args) {
       // ArrayList<String> employees = new ArrayList<>();
        HashSet<String> employees = new HashSet<>();

        employees.add("Tashin");
        employees.add("Safin");
        employees.add("Tafin");
        employees.add("Rafin");
        employees.add("Mahin");
        employees.add("Rubin");

        System.out.println(employees);

     //   employees.remove("Tashin");

       // System.out.println(employees.contains("Tashin"));
        
        Iterator<String> i = employees.iterator();

        while (i.hasNext())
        {
            System.out.println(i.next());
        }

        // Collections.sort(employees);
       // System.out.println(employees);
    }
}
