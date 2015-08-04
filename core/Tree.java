package Tree.core;

/**
 * Created by Nandkishore on 8/4/2015.
 */

import java.util.List;

/**
 * Tree is data structure with a Root and subtrees of children with a parent node.
 * A/c to graph theory, Tree is a undirected graph in which any two vertices are connected by only one path.
 * Or any connected graph with no simple cycle.
 */
public class Tree {
    private Node root;

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }
}
