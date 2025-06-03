public class ComplexityDemo {

    public static void main(String[] args) {
        int n = 100000;

        runWithTimer("O(n)", () -> methodO(n));
        runWithTimer("Θ(n²)", () -> methodTheta(n));
        runWithTimer("Ω(log n)", () -> methodOmega(n));
        runWithTimer("o(n)", () -> methodLittleO(n));
        runWithTimer("ω(n)", () -> methodLittleOmega(n));
    }

    static void runWithTimer(String label, Runnable method) {
        long start = System.nanoTime();
        method.run();
        long end = System.nanoTime();
        System.out.printf("%s → Time: %.4f seconds%n", label, (end - start) / 1e9);
    }

    static void methodO(int n) {
        for (int i = 0; i < n; i++) {
            dummy();
        }
    }

    static void methodTheta(int n) {
        for (int i = 0; i < n / 10; i++) {
            for (int j = 0; j < n / 10; j++) {
                dummy();
            }
        }
    }

    static void methodOmega(int n) {
        while (n > 1) {
            dummy();
            n /= 2;
        }
    }

    static void methodLittleO(int n) {
        int steps = (int) (Math.log(n) / Math.log(2));
        for (int i = 0; i < steps; i++) {
            dummy();
        }
    }

    static void methodLittleOmega(int n) {
        for (int i = 0; i < n / 100; i++) {
            for (int j = 0; j < n / 100; j++) {
                for (int k = 0; k < n / 100; k++) {
                    dummy();
                }
            }
        }
    }

    static void dummy() {
        int x = 1 + 1;
    }
}
