import java.util.Scanner;

class Student {
    String name = "student-name";
    String id;
    int age;
    int classNo;
    int subjects = 0;
    int[] marksInSubjects = new int[subjects];
    int totalMarks = 0;

    public void printinfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Class: " + classNo);
        System.out.println("Age: " + age);
        System.out.println("Total Subjects: " + subjects);
        System.out.println("Total Marks: " + totalMarks);
    }

}

public class StudentDataEntry {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        Student stu = new Student();

        stu = takeStudentInfo();

        stu.printinfo();

    }

    static Student takeStudentInfo() {

        Student student1 = new Student();

        System.out.print("Enter Student name : ");
        student1.name = scan.nextLine();
        System.out.print("Enter Student ID : ");
        student1.id = scan.nextLine();
        System.out.print("Enter Student class : ");
        student1.classNo = scan.nextInt();
        System.out.print("Enter Student Age : ");
        student1.age = scan.nextInt();
        System.out.print("Enter Student TotalSubjects : ");
        student1.subjects = scan.nextInt();

        student1.totalMarks = 0;
        System.out.print("Enter Student marks in individual Subjects : ");

        for (int i = 0; i < student1.subjects; i++) {
            student1.marksInSubjects[i] = scan.nextInt();
            student1.totalMarks += student1.marksInSubjects[i];
        }

        return student1;
    }

}
