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
        for(int i=0; i<a.length-1; i++) {
            for(int j=i+1; j<a.length; j++) {
                if(a[i]>a[j]) {
                    
                }
            }
        }
    }
}
