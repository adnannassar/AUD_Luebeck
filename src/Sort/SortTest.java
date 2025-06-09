package Sort;

import java.util.Scanner;

public class SortTest {
    public static void main(String[] args) {
        int [] array = {5,4,3,2,1};
        // testBubbleSort(array);
        // testInsertionSort(array);
        testSelectionSort(array);

    }

    public static void testBubbleSort(int[] array) {
        System.out.println("Before Sort");
        Printer.print(array);

        BubbleSort.bubbleSort(array);
        System.out.println("Sorted After " + BubbleSort.counter + " Steps!" );

        System.out.println("After Sort");
        Printer.print(array);
    }
    public static void testInsertionSort(int[] array) {
        System.out.println("Insertion Sort");
        Printer.print(array);

        InsertionSort.insertionSort(array);

        System.out.println("Insertion Sort");
        Printer.print(array);
    }
    public static void testSelectionSort(int[] array) {
        System.out.println("Selection Sort");
        Printer.print(array);

        SelectionSort.selectionSort(array);

        System.out.println("Selection Sort");
        Printer.print(array);
    }
}
