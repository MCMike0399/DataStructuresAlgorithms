package DoublyLinkedList;

public class DoublyLinkedList<T> {
    private DNode<T> head;
    public DoublyLinkedList() {
        head = new DNode<T>(null);
    }
    public DoublyLinkedList(T val) {
        head = new DNode<T>(val);
    }
    public void add(T val) {
        if(head.getVal()==null) {
            head.setVal(val);
            return;
        }
        DNode<T> aux = head;
        while(aux.getNext()!=null) {
            aux = aux.getNext();
        }
        aux.setNext(new DNode<T>(val));
        aux.getNext().setPrev(aux);
    }
    public boolean delete(T val) {
        if(head.getVal().equals(val)) {
            if(head.getNext()!=null) {//Has a next element
                head = head.getNext();
                head.setPrev(null);
            }
            else {
                head.setVal(null);
            }
            return true;
        }
        DNode<T> aux = head;
        while(aux.getNext()!=null && !aux.getNext().getVal().equals(val) ) {
            aux = aux.getNext();
        }
        if(aux.getNext()!=null) {
            if(aux.getNext().getVal().equals(val)) {
                if(aux.getNext().getNext()!=null) {//Has another element
                    aux.getNext().getNext().setPrev(aux);
                    aux.setNext(aux.getNext().getNext());   
                }
                else {
                    aux.getNext().setPrev(null);
                    aux.setNext(null);
                }
                return true;
            }
        }
        return false;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        DNode<T> aux = head;
        while(aux.getNext()!=null) {
            sb.append(aux.getVal() + " ");
            aux = aux.getNext();
        }
        sb.append(aux.getVal()); //Last element
        sb.append("\n");
        while(aux.getPrev()!=null) {
            sb.append(aux.getVal() + " ");
            aux = aux.getPrev();
        }
        sb.append(aux.getVal());
        return sb.toString();
    }
}
