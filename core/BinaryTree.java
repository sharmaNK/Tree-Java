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
}
