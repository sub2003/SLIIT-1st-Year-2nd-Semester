package Tute06Aggregationpage06;

public class Book {

    private String title;
    private String author;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public void displayBookDetails(){
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
    }
}
