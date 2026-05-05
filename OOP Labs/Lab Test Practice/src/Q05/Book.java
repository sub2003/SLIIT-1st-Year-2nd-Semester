package Q05;

public class Book {
    private String titlte;
    private String author;
    private int pageCount;

    public Book(String author, int pageCount, String titlte) {
        this.author = author;
        this.pageCount = pageCount;
        this.titlte = titlte;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getTitlte() {
        return titlte;
    }

    public void setTitlte(String titlte) {
        this.titlte = titlte;
    }

    public boolean isShortBook(){
        if (!(pageCount<200)){
            return false;
        }
        return true;
    }

    public void print(){
        System.out.println("Title : "+titlte);
        System.out.println("Author : "+author);
        System.out.println("Page Count : "+pageCount);
        System.out.println("Book "+(isShortBook()?"is":"is not")+" a short book.");
        System.out.println();
    }

}
