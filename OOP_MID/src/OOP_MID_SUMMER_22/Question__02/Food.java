package OOP_MID_SUMMER_22.Question__02;

public class Food {

    Double calories, fat, carb;

    Food(Double calories, Double fat,
         Double carb) {
        this.calories = calories;
        this.fat = fat;
        this.carb = carb;
    }
    Food()
    {}

    void description() {
        System.out.println("Inside Food class");
    }

}
