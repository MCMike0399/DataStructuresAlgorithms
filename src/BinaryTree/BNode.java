package BinaryTree;

public class BNode<T extends Comparable<T>> {
    private T val;
    private BNode<T> right;
    private BNode<T> left;
    private BNode<T> prev;
    public BNode() {
        val = null;
        right = null;
        left = null;
        prev = null;
    }
    public BNode(T val) {
        this.val = val;
        right = null;
        left = null;
        prev = null;
    }
    public BNode<T> getRight() {
        return this.right;
    }
    public BNode<T> getLeft() {
        return this.left;
    }
    public T getVal() {
        return this.val;
    }
    public void setRight(BNode<T> right) {
        this.right = right;
    }
    public void setLeft(BNode<T> left) {
        this.left = left;
    }
    public void setVal(T val) {
        this.val = val;
    }
    public BNode<T> getPrev() {
        return this.prev;
    }
    public void setPrev(BNode<T> prev) {
        this.prev = prev;
    }
    public void insert(BNode<T> node) {
        if(node==null) {
            return;
        }
        if(node.getVal().compareTo(val)<0) {
            this.left = node;
        }
        else {
            this.right = node;
        } 
        node.prev = this; //We assign the prev node to the node we inserted   
    }
}
