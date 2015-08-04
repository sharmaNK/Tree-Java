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
        print(tree.bt.inOrderTraversal());
    }

    public static void print(Object obj) {
        System.out.println(obj);
    }
}
