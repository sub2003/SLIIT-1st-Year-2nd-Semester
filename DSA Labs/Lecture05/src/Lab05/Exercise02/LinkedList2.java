package Lab05.Exercise02;

public class LinkedList {

    private Link first;

    public LinkedList() {
        this.first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void InsertFirst(int id, String title, int copies) {
        Link newLink1 = new Link(id, title, copies);
        newLink1.next = first;
        first = newLink1;
    }

    public boolean InsertAfter(int key, int id, String title, int copies) {
        if (isEmpty()) {
            System.out.println("Linked List is empty. Nothing Inserted.");
            return false;
        }
        Link current = first;
        while (current != null) {
            if (current.bookID == key) {
                Link newLink2 = new Link(id, title, copies);
                newLink2.next = current.next;
                current.next = newLink2;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public Link Find(int key) {
        if (isEmpty()) {
            System.out.println("Linked List is empty.");
            return null;
        }
        Link current = first;
        while (current != null) {
            if (current.bookID == key) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public Link DeleteFirst() {
        if (isEmpty()) {
            System.out.println("Linked List is empty. Nothing deleted.");
            return null;
        }
        Link temp = first;
        first = first.next;
        System.out.println("List after deleting first element: ");
        return temp;

    }

    public Link Delete(int key) {
        if (isEmpty()) {
            return null;
        }

        Link previous = null;
        Link current = first;

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
        Link current=first;
        while (current!=null){
            System.out.println("ID: "+current.bookID+", Title: "+current.bookTitle+", Copies: "+current.numberOfCoppies);
            current=current.next;
        }
    }
}

