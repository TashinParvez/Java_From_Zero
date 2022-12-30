import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // System.out.println("Enter a line : ");
        String str1 = "Tashin";
        String str2 = " Parvez";
        //   str = sc.nextLine();

        System.out.println("String length " + str1.length());
        System.out.println("To UpperCase : " + str1.toUpperCase());
        System.out.println("To LowerCase : " + str1.toLowerCase());


        System.out.println("\n----------------------------------------------------------------------");


        System.out.println(str1.trim());   // just remove first and last extra spaces

        System.out.println("SubString from index 3 : " + str1.substring(3));
        System.out.println("SubString from index 3 to index 6 : " + str1.substring(3, 6));


        System.out.println("\n----------------------------------------------------------------------");

        System.out.println("Replace all 't' to 's' : " + str1.replace('t', 's'));
        System.out.println(str1 + str2);
        System.out.println(str1.concat(str2));

        System.out.println("String start with T ? == " + str1.toUpperCase().startsWith("TA"));
        System.out.println("String End with N ? == " + str1.toUpperCase().endsWith("HIN"));

        System.out.println("\n----------------------------------------------------------------------");


        System.out.println("Char at 0 : " + str1.charAt(0));  // first index
        System.out.println("Char at last index : " + str1.charAt(str1.length() - 1)); // last index


        System.out.println("\n----------------------------------------------------------------------");

        String web = "www.MyWebsiteMyProfileMyjPageMyArticle.com";

        System.out.println(web.indexOf('.'));  // get index no
        System.out.println(web.indexOf("My"));  // get index no

        System.out.println(web.indexOf('.', 4)); // will search from 4th index


        //--------------------------------- count how many times get a string ia a string

        int countMy = 0;
        int lastInd = 0;
        int ind;
        String searchStr = "My";
        while ((ind = web.indexOf(searchStr, lastInd)) != -1) {
            countMy++;
            lastInd = ind + searchStr.length();
        }
        System.out.println("Total \"My\" founds " + countMy + " times");


        System.out.println("\n----------------------------------------------------------------------");

        str1 = "Ta";
        str2 = "ta";
        System.out.println("USING equals = " + str1.equals(str2));
        System.out.println("USING equalsIgnotringCases =" + str1.equalsIgnoreCase(str2));

        System.out.println("\n----------------------------------------------------------------------");

        str1 = "ta";
        str2 = "sa";
        String str3 = str1;
        System.out.println(str1.compareTo(str2));  // -1 first str comes first
        System.out.println(str2.compareTo(str1));  // +1 second str comes first
        System.out.println(str3.compareTo(str1));  // 0 == equal

        // upper cases are smaller than lower cases
        // means JAVA is smaller than java

        System.out.println("JAVA".compareTo("java"));

        System.out.println("\n----------------------------------------------------------------------");


    }
}
