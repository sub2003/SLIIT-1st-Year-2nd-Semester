package Lab05.Exercise02;

public class Link2 {
    int bookID;
    String bookTitle;
    int numberOfCoppies;
    Link2 next;

    public Link2(int bookID, String bookTitle,int numberOfCoppies) {
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.numberOfCoppies=numberOfCoppies;
        this.next = null;
    }

    public void displayLink(){
        System.out.println("Book ID : "+bookID);
        System.out.println("Book Title : "+bookTitle);
    }
}
