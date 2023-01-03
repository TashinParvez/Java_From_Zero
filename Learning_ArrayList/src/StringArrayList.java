import java.util.ArrayList;

public class StringArrayList {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("tashin");
        strList.add("safin");
        strList.add("zulfiker");
        strList.add("rela");

        System.out.println(strList);

        // strList.remove(0);
        strList.remove("tashin");
        System.out.println(strList);

    }
}
