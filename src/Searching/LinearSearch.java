package Searching;

public class LinearSearch {
    public static boolean search(int[] array, int value) {
        for(int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
}
