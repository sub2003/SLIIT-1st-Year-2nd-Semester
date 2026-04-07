package LinkedList;

public class Link {

    public int iData;
    public Link next;

    public Link(int data) {
        this.iData= data;
        this.next = null;
    }

    void displayLink(){
        System.out.println(iData);
    }
}
