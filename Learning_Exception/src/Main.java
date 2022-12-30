import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter array elements ");
        for (int index : arr) {
            index = sc.nextInt();
        }

        try {
            int i = arr[100];
            try {
                System.out.println("array last input " + (i + arr[100]));
            } catch (ArrayIndexOutOfBoundsException r) {
                System.out.println("running 1st one------> " + r);
            }
        } catch (Exception r2) {
            System.out.println("running 2st one------> " + r2);
        }
        finally {
            System.out.println("Yes, Atleast we finished:) ");
        }


    }
}