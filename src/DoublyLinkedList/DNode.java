package DoublyLinkedList;

public class DNode<T> {
    private T val;
    private DNode<T> prev;
    private DNode<T> next;
    public DNode() {
        val = null;
        prev = null;
        next = null;
    }
    public DNode(T val) {
        this.val = val;
        prev = null;
        next = null;
    }
    public void setNext(DNode<T> node) {
        next = node;
    }
    public void setPrev(DNode<T> node) {
        prev = node;
    }
    public DNode<T> getNext() {
        return this.next;
    }
    public DNode<T> getPrev() {
        return this.prev;
    }
    public void setVal(T val) {
        this.val = val;
    }
    public T getVal() {
        return this.val;
    }
}
