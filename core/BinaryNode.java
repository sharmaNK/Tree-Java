package Tree.core;

/**
 * Created by Nandkishore on 8/4/2015.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Binary Node is Node of a binary Tree.
 * Each node will have at max two childrens aka left and right.
 */
public class BinaryNode {

    private BinaryNode left;
    private BinaryNode right;
    private Object value;
    private BinaryNode parent;

    public BinaryNode() {}
    public BinaryNode(Object value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public BinaryNode(Object value, BinaryNode left) {
        this.value = value;
        this.left = left;
        this.right = null;
        left.setParent(this);
    }

    public BinaryNode(Object value, BinaryNode left, BinaryNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
        if(left!=null)
            left.setParent(this);

        if(right!=null)
            right.setParent(this);
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return this.value;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
        right.setParent(this);
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
        left.setParent(this);
    }

    public BinaryNode getLeft() {
        return left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setParent(BinaryNode parent) {
        this.parent = parent;
    }

    public BinaryNode getParent() {
        return parent;
    }

    public boolean isLeaf() {
        return this.left==null && this.right==null;
    }
    @Override
    public String toString() {
        return (String)this.getValue();
    }


}
