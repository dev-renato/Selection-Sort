
package selectionsort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int []v = {1, 2, 23, 512, 1024, 12, 0, -1, 12, 33, 56, 98, 54,
        65, 87, 87, 32, 1, 333, 6565};

        selectionSort(v);
        System.out.println(Arrays.toString(v));
        
    }
    private static void selectionSort(int[] v) {
        for (int i = 0; i < v.length; i++){
            int menor = i;
            for (int j = i + 1; j < v.length; j++){
                if (v[j] < v[menor]){
                    menor = j;
                }                
            }
            trocar(v, i, menor);
        }
    }

    private static void trocar(int[] v, int i, int menor) {
        int aux = v[i];
        v[i] = v[menor];
        v[menor] = aux;
    }
    
}
