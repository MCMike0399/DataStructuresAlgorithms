package Stack;

public class Stack<T> {
    T[] a;
    int top;
    public Stack() {
        a = (T[]) new Object[2];
        top = 0;
    }
    public T pop() throws Exception{
        if(top==0) {
            throw new Exception("Empty Stack");
        }
        top--;
        T val = a[top];
        a[top] = null;
        return val;
    }
    public void push(T val) {
        if(top==a.length) {
            expand();
        }
        a[top] = val;
        top++;
    }
    public T peek() throws Exception{
        if(top==0) {
            throw new Exception("Empty Stack");
        }
        return a[top-1];
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<top; i++) {
            sb.append(a[i] + " ");
        }
        return sb.toString();
    }
    public void expand() {
        T[] nA = (T[]) new Object[a.length*2];
        System.arraycopy(a, 0, nA, 0, a.length);
        a = nA;
    }
}
