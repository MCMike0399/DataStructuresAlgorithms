package BinaryTree;

public class BinarySearchTree<T extends Comparable <T>> extends BinaryTree<T> {
    private int count;
    public BinarySearchTree() {
        super();
        count = 0;
    }
    public BinarySearchTree(T val) {
        super(val);
        count = 0;
    }
    public void add(T val) {
        if(root.getVal()==null) {
            root.setVal(val);
            return;
        }
        BNode<T> current = root;
        BNode<T> prev = root;
        while(current!=null){
            prev = current;
            if(val.compareTo(current.getVal())<0) {
                current = current.getLeft();
            }
            else {
                current = current.getRight();
            }
        }
        prev.insert(new BNode<T>(val));
        count++;
    }
    public BNode<T> search(T val) {
        if(root.getVal().equals(val)) {
            return root;
        }
        BNode<T> aux = root;    
        while(aux!=null) {
            if(aux.getVal().equals(val)) {
                return aux;
            }
            if(val.compareTo(aux.getVal())<0) {
                aux = aux.getLeft();           
            }
            else {
                aux = aux.getRight();
            }
        }
        return null;
    }
    public boolean delete(T val) {
        if(root.getVal().equals(val)) {
            if(root.getRight()==null && root.getLeft()==null) {//No leafs
                root.setVal(null);
            }
            else {
                if(root.getRight()==null && root.getLeft()!=null) {//1 leaf
                    root.getPrev().insert(root.getLeft());
                }
                else if(root.getRight()!=null && root.getLeft()==null) {//1 leaf
                    root.getPrev().insert(root.getRight());
                }
                else { //two leafs
                    BNode<T> aux2 = root.getRight();
                    while(aux2.getLeft()!=null) {
                        aux2 = aux2.getLeft();
                    }
                    if(aux2.getRight()!=null) {
                        aux2.getPrev().insert(aux2.getRight());
                    }
                    else {
                        aux2.getPrev().setLeft(null);
                    }
                    root.setVal(aux2.getVal());
                }
            }
            return true;
        }
        else {//Is not the root
            BNode<T> aux = search(val);
            if(aux==null) {
                return false;
            }
            else {
                if(aux.getLeft()==null && aux.getRight()==null) {//No leaf
                    aux = aux.getPrev();
                }
                else if(aux.getLeft()!=null && aux.getRight()==null) {//1 leaf
                    aux.getPrev().insert(aux.getLeft());
                }
                else if(aux.getLeft()==null && aux.getRight()!=null) {//1 leaf
                    aux.getPrev().insert(aux.getRight());
                }
                else {//2 leafs
                    BNode<T> aux2 = aux.getRight();
                    while(aux2.getLeft()!=null) {       
                        aux2 = aux2.getLeft();
                    }
                    aux.setVal(aux2.getVal());
                    if(aux2.getRight()!=null) {
                        aux2.getPrev().insert(aux2.getRight());
                        aux2.getPrev().setLeft(null);
                    }
                    else {//No childs
                        
                    }
                }
                return true;
            }
        }
    }
}
