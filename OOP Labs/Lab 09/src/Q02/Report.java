package Q02;

public class Report implements Printable{

    private String title;
    private String author;

    public Report(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public void printDetails() {
        System.out.println("==== report Details ====");
        System.out.println("Report title : "+title);
        System.out.println("Author : "+author);
        System.out.println();
    }
}
