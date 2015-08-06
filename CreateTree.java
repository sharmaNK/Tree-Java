package Tree;

/**
 * Created by Nandkishore on 8/4/2015.
 */

import Tree.core.BST;
import Tree.core.BinaryNode;
import Tree.core.BinaryTree;

/**
 * This Class creates a demo tree that can be used in further implementation
 */
public class CreateTree {
    public BinaryTree bt;
    public BST bst;
    public CreateTree() {
        bt = new BinaryTree();
        bst = new BST();
        BinaryNode root = new BinaryNode("A");

        //bt.setRoot(root);

        BinaryNode node1 = new BinaryNode("B1");
        BinaryNode node2 = new BinaryNode("B2");

        BinaryNode node3 = new BinaryNode("C1");
        BinaryNode node4 = new BinaryNode("C2");

        BinaryNode node5 = new BinaryNode("D1");
        BinaryNode node6 = new BinaryNode("D2");

        BinaryNode node7 = new BinaryNode("E1");
        BinaryNode node8 = new BinaryNode("E2");

        BinaryNode node9 = new BinaryNode("F1");
        BinaryNode node10 = new BinaryNode("F2");

        BinaryNode node11 = new BinaryNode("G1");
        BinaryNode node12 = new BinaryNode("G2");

        BinaryNode node13 = new BinaryNode("H1");
        BinaryNode node14 = new BinaryNode("H2");

        BinaryNode node15 = new BinaryNode("I1");
        BinaryNode node16 = new BinaryNode("I2");

/*
        root.setLeft(node1);
        root.setRight(node2);

        node1.setLeft(node3);
        node1.setRight(node4);

        node2.setLeft(node5);
        node2.setRight(node6);

        node3.setLeft(node7);
        node3.setRight(node8);

        node4.setLeft(node9);
        node4.setRight(node10);

        node5.setLeft(node11);
        node5.setRight(node12);

        node6.setLeft(node13);
        node6.setRight(node14);

        node7.setLeft(node15);
        node10.setRight(node16);
*/
        bst.insertNode(root);
        bst.insertNode(node1);
        bst.insertNode(node2);
        bst.insertNode(node3);
        bst.insertNode(node4);
        bst.insertNode(node5);
        bst.insertNode(node6);
        bst.insertNode(node7);
        bst.insertNode(node8);
        bst.insertNode(node9);
        bst.insertNode(node10);
        bst.insertNode(node11);
        bst.insertNode(node12);
        bst.insertNode(node13);
        bst.insertNode(node14);
        bst.insertNode(node15);
        bst.insertNode(node16);
    }
}
