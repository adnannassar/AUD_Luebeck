package Sort;

import Extras.Swap;

// SelectionSort Sort Komplexität: Best Case: O(n^2), Mittle Case: O(n^2), Worst Case: O(n^2)
public class SelectionSort {

    /*
    * SelectionSort(array)
     for i ← 0 to length(array) - 1 do
         minIndex ← i

         for j ← i to length(array) - 1 do
             if array[j] < array[minIndex] then
                 minIndex ← j

         swap(array, i, minIndex)*/
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            Swap.swap(array, i, minIndex);
        }
    }

    public static int findMin(int[] array) {
        // annahme
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findMinIndex(int[] array) {
        // annahme
        int minIndex = 0;
        int min = array[minIndex];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
