package Tute06Aggregationpage06;

public class Library {

    private String libraryName;
    private Book[] book;

    public Library(Book[] book, String libraryName) {
        this.book = book;
        this.libraryName = libraryName;
    }

    public void desplayLibraryBooks() {
        for (int i = 0; i < book.length; i++) {
            book[i].displayBookDetails();
            System.out.println("Library : "+libraryName);
            System.out.println();
        }
    }
}
