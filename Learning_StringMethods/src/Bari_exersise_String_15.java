public class Bari_exersise_String_15 {
    public static void main(String[] args) {

        String b = "010101001010010";
        int i = 0;
        while (i < b.length()) {
            if (b.charAt(i) == '0' || b.charAt(i) == '1') {
                i++;
            } else {
                System.out.println("Break");
                break;
            }
        }
        if (i == b.length())
            System.out.println("yes its a binary");
        else
            System.out.println("no its not a  binary");
    }
}
