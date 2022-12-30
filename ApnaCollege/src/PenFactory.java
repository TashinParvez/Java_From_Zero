class PenProperties {
    String name = "BD";
    String type;

    void writting() {
        System.out.println("This is " + this.name + " Pen");
        System.out.println("This is " + name + " Pen");
    }
}


public class PenFactory {  // main clss of this Program
    public static void main(String[] args) {
        //___________________________________________________creating object of that class
        PenProperties matador = new PenProperties();
        matador.name = "Highschool";
        matador.type = "Ballpen";

        //__________________________________________________creating 2nd object
        PenProperties orbits = new PenProperties();
        // orbits.name = "orbits";
        orbits.type = "JelPen";

        //__________________________________________________calling objects methods
        // matador.writting();
        // orbits.writting();
        // System.out.println(matador.name);

    }

}
