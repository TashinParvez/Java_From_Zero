import java.util.ArrayList;
import java.util.Collections;

public class STRING_ARRAYLIST {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();

        employees.add("Tashin");
        employees.add("Safin");
        employees.add("Tafin");
        employees.add("Rafin");
        employees.add("Mahin");
        employees.add("Rubin");

        System.out.println(employees);

        Collections.sort(employees);
        System.out.println(employees);
    }
}
