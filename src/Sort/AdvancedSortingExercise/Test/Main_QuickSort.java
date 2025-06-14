package Sort.AdvancedSortingExercise.Test;

import Sort.AdvancedSortingExercise.ArrayTools.ArrayTools;
import Sort.AdvancedSortingExercise.ComplexityCalculator.TimeComplexityCalculator;
import Sort.AdvancedSortingExercise.QuickSort.QuickSort;

public class Main_QuickSort {
    public static void main(String[] args) {
        TimeComplexityCalculator timeComplexityCalculator = new TimeComplexityCalculator();
        int []array = {7, 1, 2, 0, 6, 5, 8, 3, 9, 10, 4};

        System.out.print("Before: ");
        ArrayTools.printArray(array);
        timeComplexityCalculator.start();
        QuickSort.quickSort(array, 0, array.length - 1);
        timeComplexityCalculator.end();

        System.out.print("After:  ");
        ArrayTools.printArray(array);
        System.out.println("QuickSort sort hat " + timeComplexityCalculator.getDuration() / 1000 + " ms gedauert");


    }
}
