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
        print("InOrder Traversal is : "+tree.bt.inOrderTraversal());
        print("Pre Order Traversal is : "+tree.bt.preOrderTraversal());
        print("Post Order Traversal is : "+tree.bt.postOrderTraversal());

        print("Height is : "+tree.bt.getHeight());
    }

    public static void print(Object obj) {
        System.out.println(obj);
    }
}
