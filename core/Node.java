package Tree.core;

/**
 * Created by Nandkishore on 8/4/2015.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Every point in tree is represented by Node. It can be a root vertex or any of its children or grandchildren.
 *
 */
public class Node {

    private Object value;
    private Node parent;
    private List<Node> childs;

    public Node() {}
    public Node(Object value) {
        this.value = value;
        this.childs = new ArrayList<Node>();
    }

    public Node(Object value, List<Node> childs) {
        this.value = value;
        this.childs = childs;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return this.value;
    }

    public void setChilds(List<Node> childs) {
        this.childs = childs;
    }

    public List<Node> getChilds() {
        return childs;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public Node getParent() {
        return parent;
    }

    public boolean isLeaf() {
        return this.getChilds().isEmpty();
    }
    @Override
    public String toString() {
        return (String)this.getValue();
    }

}
