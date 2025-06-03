package Laufzeit;

public class Einführung {

    public static void main(String[] args) {
        int[] array = new int[1000000000];
        for (int i = 1; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println("Searching for 1 in the array using two different algorithms:");
        search1(array, 1);
        search2(array, 1);

        System.out.println("\nSearching for 5 in the array using two different algorithms:");
        search1(array, 10000000);
        search2(array, 10000000);

        System.out.println("\nSearching for 10 in the array using two different algorithms:");
        search1(array, 1000000000);
        search2(array, 1000000000);
    }

    // BEST, MITTLE, WORST!

    static boolean search1(int[] arr, int target) {
        int counter = 0;
        for (int i = 1; i < arr.length; i++) {
            counter++;
            if (arr[i] == target) {
                System.out.println("Search Algorithm 1: Found after " + counter + " steps.");
                return true; // Found
            }
        }
        return false; // Not found
    }

    static boolean search2(int[] arr, int target) {
        boolean found = false;
        int counter = 0;
        for (int i = 1; i < arr.length; i++) {
            counter++;
            if (arr[i] == target) {
                found = true;
            }
        }
        System.out.println("Search Algorithm 2: Found after " + counter + " steps.");
        return found;
    }

    static void proz0(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("Hi");
        }
        for (int i = 1; i <= n; i++) {
            System.out.println("Hi");
        }
    }

    // 1+2+3+4+...+100 =5050 Schritte --> O(n^2)
    static void proz1(int n) {
        for (int i = 1; i <= n; i++) { // 100 Ram
            // *
            for (int j = 1; j <= 2; j++) { // i = 1 --> 1
                printHi();
            }
        }
    }


    // 100*9999*99 =  f(n): 100 * (n^2 -1) * (n - 1) --> O(n^3)
    static void proz2(int n) {
        for (int i = 1; i <= 100; i++) { // 100
            // *
            for (int j = 1; j < n * n; j++) { // 9999
                // *
                for (int k = 1; k < n; k++) { // 99
                    printHi();
                }
            }
        }
    }

    // 100+9999+99 =  f(n): 100 + (n^2 -1) + (n - 1) --> O(n^2)
    static void proz3(int n) {
        for (int i = 1; i <= 100; i++) { // 100
            printHi();
        }
        // +
        for (int j = 1; j < n * n; j++) { // 9999
            printHi();
        }
        //+
        for (int k = 1; k < n; k++) { // 99
            printHi();
        }
    }


    static void printHi() {
        System.out.println("Hi");
    }
}