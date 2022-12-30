import java.util.Scanner;

public class NewPrintMethod {
    public static void main(String[] args){
//        prnt("Hello !");
//
        String name=scan.nextLine();
//        String lastName= new String("Parvez");
//        prnt(name+' '+lastName);
//
//        name=name+' '+lastName;
//        prnt(name);

        boolean b= name.toLowerCase().equals("tashin");
        prnt(b);


    }
    static Scanner scan=new Scanner(System.in);
    static void prnt(Object anything){
        System.out.println(anything);
    }
}
