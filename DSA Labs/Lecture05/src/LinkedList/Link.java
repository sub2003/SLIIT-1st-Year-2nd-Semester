package LinkedList;

class Link {
    public int iData;   // data item
    public Link next;   // reference to the next link

    public Link(int id) {   // constructor
        iData = id;
        next  = null;
    }

    public void displayLink() {   // display data item
        System.out.println(iData);
    }
}
