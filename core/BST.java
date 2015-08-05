package Tree.core;

/**
 * Created by Nandkishore on 8/5/2015.
 */

import java.util.List;

/**
 * Binary Search Tree. Speacial kind of binary tree with right value greater than parents value and left value less than parents value
 * Specially useful to reduce search time to log(N)
 */
public class BST extends BinaryTree{
    public BST(BinaryNode root) {
        this.setRoot(root);
    }
    public BST() {}

    /**
     * Insert a node in BST at appropiate position so that it satisfy the condition
     * that at every point left child value is less than root's value
     * and right child's value is greater than parent's value.
     * @param node
     */
    public void insertNode(BinaryNode node) {
        insert(this.getRoot(), node);
    }
    private void insert(BinaryNode root, BinaryNode node) {
        if(root.compare(root,node) > 0) {
            if(root.getLeft()==null) {
                root.setLeft(node);
                return;
            }
            else {
                insert(root.getLeft(), node);
            }
        }
        else {
            if(root.getRight() == null) {
                root.setRight(node);
                return;
            }
            else {
                insert(root.getRight(), node);
            }
        }
    }


    /**
     * Sort the BST. Technically Inorder Traversal returns a sorted List of BST nodes
     * @return Sorted list of BST nodes.
     */
    public List<BinaryNode> sort() {
        return this.inOrderTraversal();
    }
}
