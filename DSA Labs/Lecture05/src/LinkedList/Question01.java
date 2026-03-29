package LinkedList;

class Question1 {
    public static void main(String[] args) {

        LinkList theList = new LinkList();   // i) create a new list

        theList.insertFirst(23);             //    insert four items
        theList.insertFirst(89);
        theList.insertFirst(12);
        theList.insertFirst(55);

        // Note: insertFirst prepends each item, so the list is stored as:
        //   55 -> 12 -> 89 -> 23 -> null
        // (last inserted appears first)

        System.out.println("List after inserting 23, 89, 12, 55:");
        theList.displayList();              // ii) display the list

        System.out.println("Deleting items one by one:");
        while (!theList.isEmpty()) {        // iii) remove until empty
            Link aLink = theList.deleteFirst();
            System.out.print("Deleted: ");
            aLink.displayLink();
        }

        System.out.println("List is now empty: " + theList.isEmpty());
    }
}

// ── Expected output ──────────────────────────────────────────────────────────
//
//  List after inserting 23, 89, 12, 55:
//  55
//  12
//  89
//  23
//
//  Deleting items one by one:
//  Deleted: 55
//  Deleted: 12
//  Deleted: 89
//  Deleted: 23
//
//  List is now empty: true
