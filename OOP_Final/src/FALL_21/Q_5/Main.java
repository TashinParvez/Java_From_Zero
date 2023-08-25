package FALL_21.Q_5;

import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>() {
            @Override
            public boolean contains(Object o) {
                if (o instanceof String) {
                    for (int i = 0; i < size(); i++) {
                        if (((Student) get(i)).name.equals(o)) {
                            return true;
                        }
                    }
                }
                return false;
            }
        };


        list.add(new Student("Wizard", 3, 3.88));
        list.add(new Student("Peter", 2, 3.5));
        list.add(new Student("Wanda", 1, 3.88));
        list.add(new Student("Thanos", 41, 3.9));
        list.add(new Student("Yelena", 7, 3.75));
        list.add(new Student("Thor", 15, 3.89));
        System.out.println("Contains \"Peter\"? " + list.contains("Peter"));


//        list.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                if (s1.cgpa > s2.cgpa) return 1;
//                else if (s2.cgpa > s1.cgpa) return -1;
//                else return 0;
//            }
//        });


        Collections.sort(list);
        for (Student s : list)
            System.out.println(s.toString());


    }
}