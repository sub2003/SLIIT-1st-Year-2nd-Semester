package SLIITModelPaperQ01;

import java.util.Scanner;

public class LibraryApp {
    static void main(String[] args) {

        Scanner scn=new Scanner(System.in);

        System.out.println("Enter title : ");
        String title=scn.nextLine();

        System.out.println("Enter book id : ");
        String id=scn.nextLine();

        System.out.print("Enter author : ");
        String author= scn.nextLine();

        System.out.println("Enter copies available : ");
        int copies= scn.nextInt();
        scn.nextLine();

        LibraryBook lb1=new LibraryBook(author,id,copies,title);


        System.out.println("Enter title : ");
        String title1=scn.nextLine();

        System.out.println("Enter book id : ");
        String id1=scn.nextLine();

        System.out.print("Enter author : ");
        String author1= scn.nextLine();

        System.out.println("Enter copies available : ");
        int copies1= scn.nextInt();
        scn.nextLine();

        LibraryBook lb2=new LibraryBook(author1,id1,copies1,title1);

        System.out.println("Enter 1st book copies want : ");
        int copiesCount= scn.nextInt();
        lb1.lendBook(copiesCount);

        System.out.println("Enter 2nd book copies want : ");
        int copiesCount1= scn.nextInt();
        lb1.lendBook(copiesCount1);


        lb1.printBookDetails();
        lb2.printBookDetails();
    }
}
