package Exercise01;


import java.util.Scanner;

public class TreeApp {
    static void main(String[] args) {

        Scanner scn =new Scanner(System.in);

        Tree tree = new Tree();

        tree.insert(149, "Anusha");
        tree.insert(167, "Kosala");
        tree.insert(47, "Dinusha");
        tree.insert(66, "Mihiri");
        tree.insert(159, "Jayani");
        tree.insert(118, "Nimal");
        tree.insert(195, "Nishantha");
        tree.insert(34, "Avodya");
        tree.insert(105, "Bimali");
        tree.insert(133, "Sampath");

        System.out.println("InOrder Traversal");
        tree.inOrder();

        System.out.println();

        System.out.println("PreOrder Traversal");
        tree.preOrder();

        System.out.println();

        System.out.println("PostOrder Traversal");
        tree.postOrder();

        System.out.println();

        System.out.print("Enter employee number to search: ");
        int empNo = scn.nextInt();

        System.out.println();

        Node foundEmployee=tree.findRecursive(empNo);

        if (foundEmployee!=null){
            System.out.println("Employee found");
            foundEmployee.displayNode();
        }
        else {
            System.out.println("Employee not found");
        }

        System.out.println();

        tree.deleteAll();

        System.out.println("After deleting all nodes.");
        tree.inOrder();

    }
}
