package BinaryTree;

public class BinaryTree<T extends Comparable<T>> {
    protected BNode<T> root;
    public BinaryTree() {
        root = new BNode<T>();
    }
    public BinaryTree(T val) {
        root = new BNode<T>(val);
    }
    public String preOrder() {
        StringBuilder sb = new StringBuilder();
        preOrder(root, sb);
        return sb.toString();
    }
    private void preOrder(BNode<T> node, StringBuilder sb) {
        if(node==null) {
            return;
        }
        sb.append(node.getVal() + " ");
        preOrder(node.getLeft(),sb);
        preOrder(node.getRight(),sb);
    }
    public String inOrder() {
        StringBuilder sb = new StringBuilder();
        inOrder(root,sb);
        return sb.toString();
    }
    private void inOrder(BNode<T> node, StringBuilder sb) {
        if(node==null) {
            return;
        }
        inOrder(node.getLeft(),sb);
        sb.append(node.getVal() + " ");
        inOrder(node.getRight(),sb);
    }
    public String postOrder() {
        StringBuilder sb = new StringBuilder();
        postOrder(root,sb);
        return sb.toString();
    }
    private void postOrder(BNode<T> node, StringBuilder sb) {
        if(node==null) {
            return;
        }
        postOrder(node.getLeft(),sb);
        postOrder(node.getRight(),sb);
        sb.append(node.getVal() + " ");
    }
}
