package Sort;

import Extras.Swap;

// BubbleSort Sort Komplexität: Best Case: O(n), Mittle Case: O(n^2), Worst Case: O(n^2)
public class BubbleSort {


    static int counter = 0;

    public static boolean isArraySorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    /*
    * BubbleSort(array)
    if NOT isArraySorted(array) then
        for i ← 0 to length(array) - 1 do
            for j ← 0 to length(array) - 2 do
                counter ← counter + 1
                if array[j] > array[j + 1] then
                    swap(array, j, j + 1)
    else
        print "Array is Sorted! no need to sort!"
    * */
    public static void bubbleSort(int[] array) {
        if (!isArraySorted(array)) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - 1; j++) {
                    counter++;
                    if (array[j] > array[j + 1]) {
                        Swap.swap(array, j, j + 1);
                    }
                }
            }
        } else {
            System.out.println("Array is Sorted! no need to sort!");
        }
    }


    /*
    * BubbleSortPlus(array)
    for i ← 0 to length(array) - 1 do
        for j ← 0 to length(array) - 2 - i do
            counter ← counter + 1
            if array[j] > array[j + 1] then
                swap(array, j, j + 1)
    * */
    public static void bubbleSortPlus(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                counter++;
                if (array[j] > array[j + 1]) {
                    Swap.swap(array, j, j + 1);
                }
            }
        }
    }
}
