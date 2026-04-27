package BinaryTree2;

public class Node {
    int key;
    int data;
    Node left;
    Node right;
    int height;

    public Node(int data,int key,int height) {
        this.height=height;
        this.key=key;
        this.data = data;
        this.left = null;
        this.right = null;
    }

    void displayNode(){
        System.out.println("Data : "+data+", Key : "+key+", Height : "+height);
    }
}
