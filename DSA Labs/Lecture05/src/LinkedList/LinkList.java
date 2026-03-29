package LinkedList;

class LinkList {
    private Link first; // link is behaving like an object so we can store any type data

    public LinkList() {         // constructor
        first = null;
    }

    public boolean isEmpty() {  // true if list is empty
        return (first == null);
    }

    public void displayList() {
        Link current = first;  // link is behaving like an object so we can store any type data
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }

    // insertFirst: creates new link, points its next to old first, updates first
    public void insertFirst(int id) {
        Link newLink  = new Link(id);
        newLink.next  = first;
        first         = newLink;
    }

    // deleteFirst: saves first in temp, advances first, returns temp
    public Link deleteFirst() {
        Link temp = first;
        first     = first.next;
        return temp;
    }
}

// ── Question 1 solution (Lecture 05, slide 20-21) ───────────────────────────
//
//  i)  Create a new linked list and insert four new links.
//  ii) Display the list.
//  iii)Remove the items one by one until the list is empty.
//
