package Fall_2022.Question_01;

public class GoT {
    {
        System.out.println("Valar dohaeris");

    }

    public String name;
    public String house;
    public double impact;
    public float intent;

    public GoT() {
        System.out.println("Best TV series ager Breaking Bad");
    }

    public GoT(String name, String house) {
        this.house = house;
        this.name = name;
    }

    public GoT(double impact) {
        this("Danenerys", "Targaryen");
        this.impact = impact;
    }

    public GoT(float intent) {
        this("Arya", "stark");
        this.intent = intent;
    }

    public void printFullName() {
        System.out.println(name + " " + house);
    }

    public void printDetails() {
        printFullName();
        System.out.println("Impact :" + impact);
        System.out.println("Intent :" + intent);
    }

    {
        System.out.println("Valar morghulis");
    }

    public static void main(String[] args) {
        GoT obj1 = new GoT();
        obj1.name = "John Snow";
        obj1.house = "404";

        GoT ob2 = new GoT(4.8);
        obj1.printDetails();
        ob2.printDetails();
    }

}


//__________________________ OUTPUT_______________________
//         Valar dohaeris
//         Valar morghulis
//         Best TV series ager Breaking Bad
//         Valar dohaeris
//         Valar morghulis
//         John Snow 404
//        Impact :0.0
//        Intent :0.0
//        Danenerys Targaryen
//        Impact :4.8
//        Intent :0.0