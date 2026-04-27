package Q02;

public class Library {
    private String libraryName;
    private int bookCount;
    private Book[] books=new Book[3];


    public Library(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void addBook(Book book) {
        if (bookCount < 3) {
            books[bookCount] = book;
            books[bookCount].setLibrary(this);
            books[bookCount].displayBookDetails();
            bookCount++;
            System.out.println("Book added successfully.");
            System.out.println();
        }
        else{
            System.out.println("Cannot add more than 3 books");
        }
    }

    public void displayLibraryDetails() {
        System.out.println("Library Name : "+libraryName);
        for (int i =0;i<3;i++){
            System.out.println("Book "+(i+1)+" : ");
            books[i].displayBookDetails();
            System.out.println();
        }
    }
}
