package SLIITModelPaperQ01;

public class LibraryBook {
    private String bookId;
    private String title;
    private String author;
    private int copiesAvailable;

    public LibraryBook(String author, String bookId, int copiesAvailable, String title) {
        this.author = author;
        this.bookId = bookId;
        this.copiesAvailable = copiesAvailable;
        this.title = title;
    }

    public void lendBook(int requestedNumberofCopies){
        if(copiesAvailable<requestedNumberofCopies){
            System.out.println("Not enough copies available. Please check back later.");
        }
        else{
            copiesAvailable=copiesAvailable-requestedNumberofCopies;
            System.out.println("Book issued successfully!");
        }
    }

    public void printBookDetails(){
        System.out.println("Title : "+title);
        System.out.println("BookID : "+bookId);
        System.out.println("Author : "+author);
        System.out.println("Copies Available : "+copiesAvailable);
    }
}
