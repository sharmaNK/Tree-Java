package Tree.core;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nandkishore on 8/4/2015.
 */
public class BinaryTree {
    private BinaryNode root;

    public void setRoot(BinaryNode root) {
        this.root = root;
    }

    public BinaryNode getRoot() {
        return root;
    }

    /**
     * Algorithm Inorder(tree)
     1. Traverse the left subtree, i.e., call Inorder(left-subtree)
     2. Visit the root.
     3. Traverse the right subtree, i.e., call Inorder(right-subtree)
     * @return List of Nodes in the order they are visited.
     */
    public List<BinaryNode> inOrderTraversal() {
        List<BinaryNode> nodeList = new ArrayList<BinaryNode>();
        inOrder(this.root, nodeList);
        return nodeList;
    }

    private void inOrder(BinaryNode node, List<BinaryNode> nodeList) {
        if(node==null)
            return;
        inOrder(node.getLeft(), nodeList);
        nodeList.add(node);
        inOrder(node.getRight(), nodeList);
    }

    /**
     * Algorithm Preorder(tree)
     1. Visit the root.
     2. Traverse the left subtree, i.e., call Preorder(left-subtree)
     3. Traverse the right subtree, i.e., call Preorder(right-subtree)
     * @return List of Nodes in the order they are visited.
     */
    public List<BinaryNode> preOrderTraversal() {
        List<BinaryNode> nodeList = new ArrayList<BinaryNode>();
        preOrder(this.root, nodeList);
        return nodeList;
    }

    private void preOrder(BinaryNode node, List<BinaryNode> nodeList) {
        if(node==null)
            return;
        nodeList.add(node);
        preOrder(node.getLeft(), nodeList);
        preOrder(node.getRight(), nodeList);
    }

    /**
     * Algorithm Postorder(tree)
     1. Traverse the left subtree, i.e., call Postorder(left-subtree)
     2. Traverse the right subtree, i.e., call Postorder(right-subtree)
     3. Visit the root.
     * @return List of Nodes in the order they are visited.
     */
    public List<BinaryNode> postOrderTraversal() {
        List<BinaryNode> nodeList = new ArrayList<BinaryNode>();
        postOrder(this.root, nodeList);
        return nodeList;
    }

    private void postOrder(BinaryNode node, List<BinaryNode> nodeList) {
        if(node==null)
            return;
        postOrder(node.getLeft(), nodeList);
        postOrder(node.getRight(), nodeList);
        nodeList.add(node);
    }

    public int getHeight() {
        return findHeight(this.root);
    }

    private int findHeight(BinaryNode node) {
        if(node==null)
            return 0;
        return Math.max(findHeight(node.getLeft()), findHeight(node.getRight()))+1;
    }
}
