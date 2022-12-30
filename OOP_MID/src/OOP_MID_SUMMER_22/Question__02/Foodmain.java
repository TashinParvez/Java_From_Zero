package OOP_MID_SUMMER_22.Question__02;

public class Foodmain {
    public static void main(String[] args) {
        Food f1 = new Fastfood(12.2,12.0,2.0,"sa","as");
        Food f2=new Homemade(12.2,12.0,2.0,12.12);

        ((Fastfood)f1).Fastfoodreview();
        ((Homemade)f2).HomemadeView();
    }
}
