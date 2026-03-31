package Lab05.Exercise02;

public class Main {
    static void main(String[] args) {

        System.out.println("List after insertions: ");
        LinkedList ll=new LinkedList();

        ll.InsertFirst(3,"Welcome",8);
        ll.InsertFirst(1,"Hello",15);
        ll.InsertFirst(2,"World",4);
        ll.displayLinkedList();

        ll.Delete(2);
        ll.displayLinkedList();

        ll.DeleteFirst();
        ll.displayLinkedList();
    }
}
