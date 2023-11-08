import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        double cgpa=0.0;
        System.out.print("How many course You have : ");
        int totalCourses = scan.nextInt();

        CourseDexcrioption[] courses = new CourseDexcrioption[totalCourses];

        for (int i = 0; i < courses.length; i++) {
            System.out.println("Enter " + (i + 1) + " course credit and then your CGPA in this course ");
            courses[i] = new CourseDexcrioption(scan.nextInt(), scan.nextDouble());
        }

        cgpa += calculateCGPA(totalCourses, courses);
        System.out.println("\n\n"+"Your CGPA "+cgpa);

        String[] s = {""};
        main(s);
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

/*
3 4
 3 4
 3 4
 1 4
 3 3.67
 */