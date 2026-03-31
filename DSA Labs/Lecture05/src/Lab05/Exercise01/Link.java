package Lab05.Exercise01;

public class Link {
    public Link next;
    public int studentId;
    public int marks;

    public Link(int marks, int studentId) {
        this.marks = marks;
        this.next = null;
        this.studentId = studentId;
    }


    public void displayLink(){
        System.out.println("ID: "+studentId+", Marks: "+marks);
    }
}
