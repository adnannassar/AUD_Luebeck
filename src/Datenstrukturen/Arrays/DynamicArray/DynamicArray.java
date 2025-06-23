package Datenstrukturen.Arrays.DynamicArray;

public class DynamicArray {
    private int[] array;
    private int size;
    private static final int INITIAL_CAPACITY = 2;

    public DynamicArray() {
        array = new int[INITIAL_CAPACITY];
        size = 0;
    }

    public void add(int value) {
        ensureCapacity();
        array[size] = value;
        size++;
    }

    private void ensureCapacity() {
        if (size == array.length) {
            int[] newArray = new int[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public void remove(int index) {
        if (checkIndex(index)) {
            // shifting
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            // setting the last index as empty index!
            array[--size] = 0;
        }
    }

    private boolean checkIndex(int index) {
        return index >= 0 && index < size;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public void printDynamicArray() {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }
}
