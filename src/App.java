import LinkedList.*;
import DoublyLinkedList.*;
import Stack.*;
public class App {
    public static void main(String[] args) throws Exception {
        Stack<Integer> s = new Stack<Integer>();
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.println(s.toString());
        s.pop();
        s.pop();
        System.out.println(s.toString());
    }
}
