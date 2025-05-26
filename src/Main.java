public class Main {

    public static void main(String[] args) {
        proz2(100);
        // Farah 11
        // Hanan
        // Ousama 11
        // Hamada 11
    }

    // 1+2+3+4+...+100 =5050 Schritte --> O(n^2)
    static void proz1(int n) {
        for (int i = 1; i <= n; i++) { // 100
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