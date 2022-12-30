package OOP_LAB_CT2;

import java.util.Scanner;

public class Cupboard {
    static Scanner scan = new Scanner(System.in);
    int items;

    Cupboard() {
        this.items = 0;
    }

    Cupboard(int items) {
        this.items = items;
    }

    void additems() {
        this.items++;
    }

    void additems(int items) {
        this.items += items;
    }

    void open() {
        System.out.println("Cupboard Open");
    }

//
//    @Override
//    public boolean equals(String str2) {
//        int flag = 0, i = 0;
//        for (char x = this) {
//            if (x == str2[i])
//                flag = 1;
//            if (flag > 0)
//                return false;
//            i++;
//        }
//        return true;
//    }

}
