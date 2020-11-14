import LinkedList.*;
import DoublyLinkedList.*;
import Stack.*;
import Queue.*;
import BinaryTree.*;
import SortAlgorithms.*;
public class App {
    public static void main(String[] args) throws Exception {
        /*BinarySearchTree<Integer> a = new BinarySearchTree<Integer>();
        a.add(8);
        a.add(4);
        a.add(12);
        a.add(2);
        a.add(6);
        a.add(10);
        a.add(14);
        a.add(1);
        a.add(3);
        a.add(5);
        a.add(7);
        a.add(9);
        a.add(11);
        a.add(13);
        a.add(15);
        //a.delete(14);
        System.out.println(a.postOrder());*/
        Sort s = new Sort(5);
        s.insertVal();
        s.bubbleSort();
        System.out.println(s.print());
    }
}
