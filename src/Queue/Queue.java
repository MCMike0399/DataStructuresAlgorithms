package Queue;

public class Queue<T> {
    private int front;
    private  int rear;
    private T a[];
    public Queue() {
        a = (T[]) new Object[6];
        front = 0;
        rear = 0;
    }
    public void enqueue(T val){
        a[rear%a.length] = val;
        rear++;
    }
    public T dequeue() {
        T val = a[front%a.length];
        front++;
        return val;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder(); 
        for(int i = front%a.length; i<rear%a.length; i++) {
            sb.append(a[i] + " ");
        }
        return sb.toString();
    }
    public int getRear() {
        return this.rear;
    }
    public int getFront() {
        return this.front;
    }
    public void expand() {

    }
}
