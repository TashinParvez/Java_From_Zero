package OOP_LAB_CT2;

public class RoomOfRequrements extends Cupboard {
    // private int passward = 10;  //___ use if password is in int
    private String passward = "10";

    RoomOfRequrements() {
        super();
    }

    @Override
    void open() {
        System.out.println("Please Inter password : ");
        // int userPassward = scan.nextInt();
        String userPassward = scan.nextLine();


        // if (userPassward == passward)  //___ use if password is in int
        if (passward.equals(userPassward)) //___ use if password is in String
            System.out.println("Open Room for requirements");
        else
            System.out.println("There is no room for requirements");


        // __________another approach
//        if (Objects.equals(userPassward, passward))
//            System.out.println("Open Room for requirements");
//        else
//            System.out.println("There is no room for requirements");

    }
}
