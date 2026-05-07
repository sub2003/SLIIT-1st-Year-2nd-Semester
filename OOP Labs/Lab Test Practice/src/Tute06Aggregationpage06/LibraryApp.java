package Tute06Aggregationpage06;

public class LibraryApp {

    static void main(String[] args) {


        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Harper Lee", "To Kill a Mockingbird");

        Book[] book = {book1, book2};

        Library library1 = new Library(book, "SLIIT Library");
        library1.desplayLibraryBooks();
    }
}