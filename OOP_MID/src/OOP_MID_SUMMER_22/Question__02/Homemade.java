package OOP_MID_SUMMER_22.Question__02;

public class Homemade extends Food{
    double protine;

    Homemade(Double calories, Double fat, Double carb, double protine) {
        super(calories, fat, carb);
        this.protine = protine;
    }

    void HomemadeView() {
        System.out.println("Inside the review method of Homemade class.");
    }

    @Override
    void description() {
        System.out.println("Inside Food class");
    }
}
