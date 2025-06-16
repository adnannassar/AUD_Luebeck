package Searching;

import Sort.AdvancedSortingExercise.ArrayTools.ArrayTools;

public class TestSearch {
    public static void main(String[] args) {
        // testLinearSearch();
        // testBinarySearchIterative();
        testBinarySearchRecursive();

    }

    private static void testLinearSearch() {
        int n = 11;
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Searching for " + n + " in : ");
        ArrayTools.printArray(array);

        boolean found = LinearSearch.search(array, n);
        if (found) {
            System.out.println(n + " Found");
        } else {
            System.out.println(n + " Not Found");
        }
    }

    private static void testBinarySearchIterative() {
        int n = 3;
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Searching for " + n + " in : ");
        ArrayTools.printArray(array);

        boolean found = BinarySearch.binarySearchIterative(array, n);
        if (found) {
            System.out.println(n + " Found");
        } else {
            System.out.println(n + " Not Found");
        }
    }

    private static void testBinarySearchRecursive() {
        int n = 4;
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Searching for " + n + " in : ");
        ArrayTools.printArray(array);

        boolean found = BinarySearch.binarySearchRecursive(array, n);
        if (found) {
            System.out.println(n + " Found");
        } else {
            System.out.println(n + " Not Found");
        }
    }
}

