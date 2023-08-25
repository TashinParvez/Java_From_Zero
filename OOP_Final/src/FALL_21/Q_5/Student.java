package FALL_21.Q_5;

class Student implements Comparable<Student> {
    String name;
    int id;
    double cgpa;

    public Student(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    public Student(String name) {
        this.name = name;
        this.id = -1;
        this.cgpa = -1;
    }

    @Override
    public int compareTo(Student s) {
        if (this.cgpa < s.cgpa)
            return 1;
        else if (this.cgpa > s.cgpa)
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return this.name + " " + this.id + " " + this.cgpa;
    }

}