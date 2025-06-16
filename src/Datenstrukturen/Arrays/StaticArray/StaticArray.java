package Datenstrukturen.Arrays.StaticArray;

public class StaticArray {
    public static void main(String[] args) {
        int[] array = new int[3];
        // int --> 4 byte  3 * 4 --> 12 byte size of array

        array[0] = 100;
        array[1] = 200;
        array[2] = 300;
        // array[2] = 3; array is full!!! size of array is static not dynamic

        // Komplexität von insert at Start: O(1)
        // Komplexität von insert at End: O(1)
        // Komplexität von insert at Middle: O(1) length/2
        // Komplexität von insert at beliebige Stelle: O(1)

        // Komplexität von search for number exists at Start: O(1)
        // Komplexität von search for number exists at End: O(1)
        // Komplexität von search for number exists int the Middle: O(1) length/2
        // Komplexität von search for number exists in a random index (beliebige Stelle): O(n)

        // Komplexität von lesen at Start: O(1)
        // Komplexität von lesen at End: O(1)
        // Komplexität von lesen at Middle: O(1) length/2
        // Komplexität von lesen at beliebige Stelle: O(1)
    }
}
