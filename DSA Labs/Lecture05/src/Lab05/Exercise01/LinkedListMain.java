
package Lab05.Exercise01;

public class LinkedListMain {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.InsertFirst(103,75);
        list.InsertFirst(101,85);
        list.InsertFirst(102,90);

        System.out.println("List after insertions:");
        list.displayLink();

        list.Delete(102);
        System.out.println("List after deleting ID 102:");
        list.displayLink();

        list.DeleteFirst();
        System.out.println("List after deleting first element:");
        list.displayLink();
    }
}
