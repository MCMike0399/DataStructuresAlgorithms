package LinkedList;

public class LinkedList<T> {
    private Node<T> head;
    public LinkedList() {
        head = new Node<T>();
    }
    public LinkedList(T val) {
        head = new Node<T>(val);
    }
    public void add(T val) {
        if(head.getVal()==null) {//If the list is empty
            head.setVal(val);
            return;
        }
        Node<T> aux = head;
        while(aux.getNext()!=null) {
            aux = aux.getNext();
        }
        aux.setNext(new Node<T>(val));
    }
    public boolean delete(T val) {
        if(head.getVal().equals(val)) {
            if(head.getNext()!=null) {//Has a next element
                head = head.getNext();
            }
            else {
                head.setVal(null);
            }
            return true;
        }
        Node<T> aux = head;
        while(aux.getNext()!=null && !aux.getNext().getVal().equals(val)) {
            aux = aux.getNext();
        }
        if(aux.getNext()!=null) {
            if(aux.getNext().getVal().equals(val)) {
                if(aux.getNext().getNext()!=null) {//Has another element
                    aux.setNext(aux.getNext().getNext()); 
                }
                else {
                    aux.setNext(null);
                }
                return true;
            }
        }
        return false;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> aux = head;
        while(aux.getNext()!=null) {
            sb.append(aux.getVal() + " ");
            aux = aux.getNext();
        }
        sb.append(aux.getVal()); //Last element
        return sb.toString();
    }
}
