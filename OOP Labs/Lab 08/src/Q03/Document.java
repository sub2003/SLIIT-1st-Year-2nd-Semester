package Q03;

public class Document {
    private String title;
    private String content;

    public Document(String title,String content) {
        this.content = content;
        this.title = title;
    }

    public void displayDocuments(){
        System.out.println("Title : "+title);
        System.out.println("Content : "+content);
    }
}
