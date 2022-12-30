package Inheritance;

import java.util.Scanner;

public class oop {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        Circle wheel = new Circle();
//        wheel.color = "black";

//        NFT.Arts note = new Arts();
//        note.name = "TAshin";

        Circle football = new Circle();
        football.radious = 5;
        football.color = "red";

        football.corner = 0;
        football.getArea();

        HalfCircle tennisBall = new HalfCircle();
        tennisBall.color = "Green";
        tennisBall.radious = 5;
        tennisBall.getArea();

    }
}
