package Q1;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private double price;

    public Book(String title,String author) {
        this.title = title;
        this.author = author;

    }

    public Book(String title,String author,  String ISBN) {
        this.author = author;
        this.title = title;
        this.ISBN = ISBN;
    }

    public Book(String title,String author, String ISBN, double price) {
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
        this.title = title;
    }
    public void getBookDetails(){
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("ISBN : "+ISBN);
        System.out.println("Price : "+price);
    }
    public void getBookDetails(String isbn){
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("ISBN : "+isbn);
        System.out.println("Price : "+price);
    }

    static void main(String[] args) {

        Book book1=new Book("Harry Potter and Philosopher's Stone","J.K. Rowling");
        Book book2=new Book("Pride and Prejudice","Jane Austen","978-0-13-468599-1");
        Book book3=new Book("The Alchemist","Paulo Coelho","978-0-262-03384-8",25000);

        book1.getBookDetails();
        System.out.println();
        book1.getBookDetails("978-1-491-95424-9");
        System.out.println();
        book2.getBookDetails();
        System.out.println();
        book3.getBookDetails();
    }

}
