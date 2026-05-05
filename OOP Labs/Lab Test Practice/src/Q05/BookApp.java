package Q05;

import java.util.Scanner;

public class BookApp {
    static void main(String[] args) {

        Scanner scn=new Scanner(System.in);

        System.out.println("Enter details for book 1 : ");

        System.out.print("Title : ");
        String title1= scn.nextLine();

        System.out.print("Author : ");
        String author1=scn.nextLine();

        System.out.print("Page Count : ");
        int pageCount1= scn.nextInt();
        scn.nextLine();

        Book book1=new Book(author1,pageCount1,title1);

        System.out.println();
        System.out.println("Enter details for book 2 : ");

        System.out.print("Title : ");
        String title2= scn.nextLine();

        System.out.print("Author : ");
        String author2=scn.nextLine();

        System.out.print("Page Count : ");
        int pageCount2= scn.nextInt();

        Book book2=new Book(author2,pageCount2,title2);

        Book[] books=new Book[2];
        books[0]=book1;
        books[1]=book2;
        //book1.print();
        //book2.print();

        System.out.println();
        System.out.println("----- Displaying the details of books -----");

        for(int i=0;i<books.length;i++){
            System.out.println("Details of Book "+(i+1));
            books[i].print();
        }


    }
}
