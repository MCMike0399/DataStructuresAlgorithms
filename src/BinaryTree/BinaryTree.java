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
}
