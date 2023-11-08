package First;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Laptop> list = new ArrayList<>();
        list.add(new Laptop("Lenovo", 70000, 6));
        list.add(new Laptop("Apple", 1000000, 12));
        list.add(new Laptop("Asus", 80000, 8));


        Collections.sort(list);


        for (Laptop obj : list) {
            System.out.println(obj.toString());
        }


//        ArrayList<String> str = new ArrayList<>();
//        str.add("Tashin");
//        str.add("tashin");
//        str.add("TASHIN");
//        Collections.sort(str);
//        for (String s : str) {
//            System.out.println(s);
//        }

//        ArrayList<Character> chars = new ArrayList<>();
//        chars.add('A');
//        chars.add('z');
//        chars.add('a');
//        Collections.sort(chars);
//        for (char s : chars) {
//            System.out.println(s);
//        }

//        ArrayList<Integer> ints = new ArrayList<>();
//        ints.add(12312312);
//        ints.add(12);
//        ints.add(122);
//        ints.add(1231232);
//        ints.add(13122);
//        Collections.sort(ints);
//        for (int a : ints) {
//            System.out.println(a);
//        }


    }
}