package Sort.FirstLessonInSorting;

import Extras.Swap;
// InsertionSort Sort Komplexität: Best Case: O(n), Mittle Case: O(n^2), Worst Case: O(n^2)
public class InsertionSort {
    /*
    insertionSort(array)
    for i ← 0 to length(array) - 1 do
        for j ← length(array) - 1 down to 1 do
            if array[j] < array[j - 1] then
                swap(array, j, j - 1)
    */
    public static void insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    Swap.swap(array, j, j - 1);
                }
            }
        }
    }

    /*
    InsertionSort(array)
        for j ← 1 to length(array) - 1 do
            key ← array[j]
            i ← j - 1

            while i ≥ 0 and array[i] > key do
                array[i + 1] ← array[i]
                i ← i - 1

            array[i + 1] ← key
    */
    public static void insertionSortPlus(int[] array) {
        for (int j = 1; j < array.length; j++) {
            int key = array[j];
            int i = j - 1;
            while (i >= 0 && array[i] > key) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }
}
