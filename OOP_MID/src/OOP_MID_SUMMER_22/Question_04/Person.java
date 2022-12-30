package OOP_MID_SUMMER_22.Question_04;

public class Person {
    private double id, height, weight;
    private String name;

    public void getId() {
        System.out.println(this.id);
    }
    public void setId(double id) {
        this.id = id;
    }

    public void getHeight() {
        System.out.println(this.height);
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void getweight() {
        System.out.println(this.weight);
    }
    public void setweight(double weight) {
        this.weight = weight;
    }

    void getname() {
        System.out.println(this.name);
    }

    void setname(String name) {
        this.name = name;
    }


    void masureBMI()
    {
        System.out.println("person BMI "+ weight/(height*height));
    }

}
