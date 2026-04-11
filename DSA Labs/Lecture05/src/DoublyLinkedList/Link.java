package DoublyLinkedList;

public class Link {

    int key;
    int data;
    Link next;
    Link previous;

    public Link(int key,int data) {
        this.data = data;
        this.key = key;
        this.previous = null;
        this.next = null;
    }

    public void displayLink() {
        System.out.println("Key : "+key+" Data : "+data);
    }
}
