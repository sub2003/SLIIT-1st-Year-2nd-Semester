package Lab05.Exercise02;

public class LinkedList2 {

    private Link2 first;

    public LinkedList2() {
        this.first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void InsertFirst(int id, String title, int copies) {
        Link2 newLink1 = new Link2(id, title, copies);
        newLink1.next = first;
        first = newLink1;
    }

    public boolean InsertAfter(int key, int id, String title, int copies) {
        if (isEmpty()) {
            System.out.println("Linked List is empty. Nothing Inserted.");
            return false;
        }
        Link2 current = first;
        while (current != null) {
            if (current.bookID == key) {
                Link2 newLink2 = new Link2(id, title, copies);
                newLink2.next = current.next;
                current.next = newLink2;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public Link2 Find(int key) {
        if (isEmpty()) {
            System.out.println("Linked List is empty.");
            return null;
        }
        Link2 current = first;
        while (current != null) {
            if (current.bookID == key) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public Link2 DeleteFirst() {
        if (isEmpty()) {
            System.out.println("Linked List is empty. Nothing deleted.");
            return null;
        }
        Link2 temp = first;
        first = first.next;
        System.out.println("List after deleting first element: ");
        return temp;

    }

    public Link2 Delete(int key) {
        if (isEmpty()) {
            return null;
        }

        Link2 previous = null;
        Link2 current = first;

        while (current != null) {
            if (current.bookID == key) {
                if (current == first) {
                    first = first.next;
                } else {
                    previous.next = current.next;
                }
                System.out.println("List after deleting ID "+current.bookID+": ");
                return current;
            }
            previous = current;
            current = current.next;
        }
        return null;
    }

    public void displayLinkedList(){
        Link2 current=first;
        while (current!=null){
            System.out.println("ID: "+current.bookID+", Title: "+current.bookTitle+", Copies: "+current.numberOfCoppies);
            current=current.next;
        }
    }
}

