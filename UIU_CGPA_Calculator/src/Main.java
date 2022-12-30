import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("How many course You have : ");
        int totalCourses = scan.nextInt();

        CourseDexcrioption[] courses = new CourseDexcrioption[totalCourses];

        for (int i = 0; i < courses.length; i++) {
            System.out.println("Enter " + (i + 1) + " course credit and then your CGPA in this course ");
            courses[i] = new CourseDexcrioption(scan.nextInt(), scan.nextDouble());
        }

        double cgpa = calculateCGPA(totalCourses, courses);
        System.out.println("Your CGPA "+cgpa);
    }

    static double calculateCGPA(int totalCourses, CourseDexcrioption[] courses) {
        int totalCradits = 0;
        double sumOfCraditandCGPAmulti = 0;
        for (int i = 0; i < totalCourses; i++) {
            totalCradits += courses[i].courseCredit;
            sumOfCraditandCGPAmulti += courses[i].creditAndCGPAmulti;
        }
        return sumOfCraditandCGPAmulti / totalCradits;
    }
}