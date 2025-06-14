package Sort.AdvancedSortingExercise.Test;

import Sort.AdvancedSortingExercise.ArrayTools.ArrayTools;
import Sort.AdvancedSortingExercise.BubbleSort.BubbleSort;
import Sort.AdvancedSortingExercise.ComplexityCalculator.TimeComplexityCalculator;

public class Main_BubbleSort {
    public static void main(String[] args) {
        TimeComplexityCalculator timeComplexityCalculator = new TimeComplexityCalculator();
        int []array = {7,1,2,5,4,3};

        System.out.print("Before: ");
        ArrayTools.printArray(array);
        timeComplexityCalculator.start();
        BubbleSort.bubbleSort(array);
        timeComplexityCalculator.end();

        System.out.print("After:  ");
        ArrayTools.printArray(array);
        System.out.println("Bubble sort hat " + timeComplexityCalculator.getDuration() / 1000 + " ms gedauert");

    }
}
