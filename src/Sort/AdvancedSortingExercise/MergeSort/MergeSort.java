package Sort.AdvancedSortingExercise.MergeSort;

public class MergeSort {
    public static int[] origArray;
    public static int[] tempArray;

    public static void mergeSort(int[] array) {
        origArray = array;
        tempArray = new int[array.length];
        doMergeSort(0, origArray.length - 1);
    }

    private static void doMergeSort(int startIndex, int stopIndex) {
        if (startIndex < stopIndex) {
            int middle = startIndex + (stopIndex - startIndex) / 2; // REGEL

            // from start index to middle index
            doMergeSort(startIndex, middle);

            // from middle index to end index
            doMergeSort(middle + 1, stopIndex);

            // merge the parts
            mergeParts(startIndex, middle, stopIndex);
        }
    }

    private static void mergeParts(int startIndex, int middle, int stopIndex) {
        for (int i = startIndex; i <= stopIndex; i++) {
            tempArray[i] = origArray[i];
        }
        int i = startIndex;
        int j = middle + 1;
        int k = startIndex;
        while (i <= middle && j <= stopIndex) {
            if (tempArray[i] <= tempArray[j]) {
                origArray[k] = tempArray[i];
                i++;
            } else {
                origArray[k] = tempArray[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            origArray[k] = tempArray[i];
            k++;
            i++;
        }
    }
}
