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
        if(this.getRoot()==null) {
            this.setRoot(node);
            return;
        }
        insert(this.getRoot(), node);
    }
    private void insert(BinaryNode root, BinaryNode node) {
        if(node==null)
            return;
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
     * Search for a value in this BST. It take log(N)
     * @param value
     * @return
     */
    public boolean searchNode(Object value) {
        return search(this.getRoot(), value);
    }

    /**
     * Search for the value in sub tree with given param as a root of subtree
     * @param root Root of subtree
     * @param value Value to compare with
     * @return True if value is found in tree else False
     */
    private boolean search(BinaryNode root, Object value) {
        if(root == null)
            return false;
        if(root.compareValues(value)==0) {
            return true;
        }
        else if(root.compareValues(value) > 0) {
            return search(root.getLeft(), value);
        }
        else
            return search(root.getRight(), value);
    }

    /**
     * Sort the BST. Technically Inorder Traversal returns a sorted List of BST nodes
     * @return Sorted list of BST nodes.
     */
    public List<BinaryNode> sort() {
        return this.inOrderTraversal();
    }
}
