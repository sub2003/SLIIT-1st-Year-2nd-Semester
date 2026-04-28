package Q02;

public class LibraryApp {

    static void main(String[] args) {

        Library library=new Library("SLIIT LIBRARY");

        Book book1=new Book("789-98765","Java Programming");
        Book book2=new Book("345-76632","Database Concepts");
        Book book3=new Book("234-43125","Software Engineering");

        System.out.println("===== Adding Books into Library =====");
        System.out.println();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println();
        System.out.println("===== Library Details =====");
        System.out.println();
        library.displayLibraryDetails();
    }
}
