public class Bari_exersise_String_14 {
    public static void main(String[] args) {
        String givenStr = "tashinParvez@gmail.com";

        // QUESTION'S
        // find it's a gmail or not
        // find userName and Domain name of the mail address

        int indexNo = givenStr.toLowerCase().indexOf("gmail");
        if (indexNo > -1)
            System.out.println("yes it's a gmail account");
        else System.out.println("No it is not a gmail account");

        String str = givenStr.substring(0, indexNo - 1);
        System.out.println("User name : " + str);

        str = givenStr.substring(givenStr.indexOf('@') + 1, givenStr.length());
        System.out.println("Doman name : " + str);

    }
}
