package Sort.AdvancedSortingExercise.Test;

import Sort.AdvancedSortingExercise.ArrayTools.ArrayTools;
import Sort.AdvancedSortingExercise.ComplexityCalculator.TimeComplexityCalculator;
import Sort.AdvancedSortingExercise.MergeSort.MergeSort;

public class Main_MergeSort {
    static int[] array1 = {7, 1, 2, 0, 6, 5, 8, 3, 9, 10, 4};

    public static void main(String[] args) {
        TimeComplexityCalculator timeComplexityCalculator = new TimeComplexityCalculator();

        System.out.print("Before: ");
        ArrayTools.printArray(array1);
        timeComplexityCalculator.start();
        MergeSort.mergeSort(array1);
        timeComplexityCalculator.end();

        System.out.print("After:  ");
        ArrayTools.printArray(array1);
        System.out.println("MergeSort sort hat " + timeComplexityCalculator.getDuration() / 1000 + " ms gedauert");
    }
}
