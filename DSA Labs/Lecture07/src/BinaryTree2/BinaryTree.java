package BinaryTree2;

public class BinaryTree {

    Node root;

    public BinaryTree() {
        root = null;
    }

    // isEmpty method
    public boolean isEmpty() {
        return root == null;
    }


    public Node minimum(){
        Node current=root;
        if(current==null){
            return null;
        }

        while(current.left !=null){
            current=current.left;

        }
        return current;
    }


    Node maximum(){
        Node current=root;

        if(current==null){
            return null;
        }

        while (current.right!=null){
            current=current.right;
        }
        return current;
    }


    void discendingOrder(){
        Node current=maximum();

        if (current==null){
            System.out.println("Tree is Empty");
        }


    }
}
