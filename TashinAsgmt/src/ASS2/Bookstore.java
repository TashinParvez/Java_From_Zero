package ASS2;

import java.util.Scanner;

class Book{
    Book(String bookName, double bookPrice)
    {

    }
    private String bookName;
    private double bookPrice;
    public static int count=0;

    public String getBookName() {
        return bookName;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setAll(String bookName, double bookPrice){
        this.bookName=bookName;
        this.bookPrice=bookPrice;
    }
}

public class Bookstore {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        Book myBook = new Book[in.nextLine(),in.nextDouble()];

        Book[] books=new Book[100];
        System.out.println();

        System.out.println("Welcome to Bookstore !");

        while(true){
            System.out.println();
            System.out.println();
            System.out.println("[a] -> Add books.");
            System.out.println("[q] -> Quit the program.");
            System.out.println("[p] -> Show book list.");

            char ch=in.next().charAt(0);

            if(ch=='a'){
                System.out.println("How many books? ");
                int t=in.nextInt();

                for(int i=0;i<t;i++){

                    String[] name=new String[t];
                    double[] price=new double[t];

                    books[i]=new Book();   // manually allocate an element of Book array otherwise bug: null pointer exception

                    in.nextLine();

                    System.out.println("Enter Book "+(i+1)+" name: ");
                    name[i]=in.nextLine();
                    System.out.println("Enter Book "+(i+1)+" price: ");
                    price[i]=in.nextDouble();
                    books[i].setAll(name[i],price[i]);
                    Book.count++;
                }
                System.out.println("Book stored successfully!");
            }
            else if(ch=='p'){
                if(Book.count==0){
                    System.out.println("\nNo book found!\n");
                }
                else{
                    for(int i=0;i<Book.count;i++){

                        System.out.println("Book name: [ " + books[i].getBookName() + "] Book Price: [" + books[i].getBookPrice()+" TK]");

                    }
                }

            }
            else if(ch=='q') return;
            else{
                System.out.println("Please choose a valid option!");
            }
        }
    }
}