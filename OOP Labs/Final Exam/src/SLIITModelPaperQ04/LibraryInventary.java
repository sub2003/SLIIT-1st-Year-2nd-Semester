package SLIITModelPaperQ04;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryInventary {
    static void main(String[] args) {

        ArrayList<Book> inventory = new ArrayList<Book>();

        Scanner scn = new Scanner(System.in);

        while (true) {
            System.out.println("Enter ISBN : ");
            String isbn = scn.nextLine();

            if (isbn.equals("-99")) {
                break;
            }

            System.out.println("Enter Title : ");
            String title = scn.nextLine();

            Book book=new Book(isbn,title);

            inventory.add(book);
        }

        System.out.println("Enter ISBN of the book you wish to remove : ");
        String remove_isbn= scn.nextLine();

        for(int i=0;i<inventory.size();i++){
            if(inventory.get(i).getIsbn().equalsIgnoreCase(remove_isbn)){
                inventory.remove(i);
                System.out.println("Book removed successfully.");
            }
            else{
                System.out.println("ISBN not found. No book removed.");
            }
        }

        System.out.println("Total number of books : "+inventory.size());

        for(Book book:inventory){
            book.displayDetails();
        }
    }
}
