package LinkedList;
public class Node<T> {
    private T val;
    private Node<T> next;
    public Node() {
        val = null;
        next = null;
    }
    public Node(T val) {
        this.val = val;
        next = null;
    }
    public T getVal() {
        return this.val;
    }
    public Node<T> getNext() {
        return this.next;
    }
    public void setVal(T val) {
        this.val = val;
    }
    public void setNext(Node<T> next) {
        this.next = next;
    }
}
