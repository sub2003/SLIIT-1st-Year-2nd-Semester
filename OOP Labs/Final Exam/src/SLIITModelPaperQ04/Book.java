package SLIITModelPaperQ04;

public class Book {
    private String isbn;
    private String title;

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void displayDetails(){
        System.out.println("Title : "+title);
        System.out.println("ISBN : "+isbn);
        System.out.println();
    }

}
