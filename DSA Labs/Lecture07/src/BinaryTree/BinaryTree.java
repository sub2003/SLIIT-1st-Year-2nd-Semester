package BinaryTree;

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


}
