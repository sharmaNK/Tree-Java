package Tree.Algorithms;

import Tree.CreateTree;

/**
 * Created by Nandkishore on 8/4/2015.
 */

/**
 * Demo class created to execute algorithms
 */
public class Main {
    public static void main(String[] args) {
        CreateTree tree = new CreateTree();
        print("InOrder Traversal is : "+tree.bst.inOrderTraversal());
        print("Pre Order Traversal is : "+tree.bst.preOrderTraversal());
        print("Post Order Traversal is : "+tree.bst.postOrderTraversal());

        print("Height is : "+tree.bst.getHeight());

        print("Sorted order : "+tree.bst.sort());

        print("Search D2 "+tree.bst.searchNode("D2"));
    }

    public static void print(Object obj) {
        System.out.println(obj);
    }
}
