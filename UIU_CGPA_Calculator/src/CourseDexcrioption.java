public class CourseDexcrioption {
//    String courseName;
    int courseCredit;
    double courseCGPA;
    double creditAndCGPAmulti;
    CourseDexcrioption(int courseCredit,double courseCGPA)
    {
        this.courseCredit=courseCredit;
        this.courseCGPA=courseCGPA;
        this.creditAndCGPAmulti = courseCredit * courseCGPA;
    }

}
