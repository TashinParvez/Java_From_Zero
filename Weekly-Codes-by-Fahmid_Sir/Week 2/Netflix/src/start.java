import java.util.Scanner;
public class start {

    public static void main(String[] args) {

        Netflix_Entity m[]= new Netflix_Entity[100] ;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Movie Numbers = ");
        int movie_count = sc.nextInt();

        for(int i=0;i<movie_count;i++)
        {
            System.out.println();
            m[i] = new Netflix_Entity();
            System.out.print("Enter Movie Name = ");
            m[i].name = sc.next();
            System.out.print("Enter Movie ratting = ");
            m[i].ratting = sc.nextDouble();
            System.out.print("Enter Movie genre = ");
            m[i].genre = sc.next();
        }

        for(int i=0;i<movie_count;i++) {
            System.out.println();
            System.out.println("Movie Name = " + m[i].name);
            System.out.println("Movie ratting = " + m[i].ratting);
            System.out.println("Movie genre = " + m[i].genre);

        }
    }


}
