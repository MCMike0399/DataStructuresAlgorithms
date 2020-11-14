package SortAlgorithms;
import java.util.Scanner;

public class Sort {
    int[] a;
    public Sort(int length) {
        a = new int[length];
    }
    public void insertVal() {
        Scanner input = new Scanner(System.in);
        for(int i=0; i<a.length; i++) {
            a[i] = input.nextInt();
        }
        input.close();
    }
    public void bubbleSort() {
        int aux;
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<a.length-1; j++) {
                if(a[j]>a[j+1]) {
                    aux = a[j];
                    a[j] = a[j+1];
                    a[j+1] = aux;    
                }
            }
        }
    }
    public void selectionSort() {
        int aux;
        for(int i=0; i<a.length; i++) {
            aux = a[i];
            for(int j=0; j<a.length; j++) {
                
            }
        }
    }
    public void insertionSort() {

    }
    public String print() {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<a.length; i++) {
            sb.append(a[i] + " ");
        }
        return sb.toString();
    }
}
