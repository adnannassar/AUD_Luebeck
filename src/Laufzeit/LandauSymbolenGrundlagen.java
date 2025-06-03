package Laufzeit;

public class LandauSymbolenGrundlagen {
    public static void main(String[] args) {
        bigONotation(10); //
    }

    // O(n) - Big O Notation: Wir sagen, dass ein Algorithmus in O(n) ist,
    // wenn seine Ausführungszeit die Anzahl der Eingabeelemente (n) nicht wesentlich überschreitet.
    static void bigONotation(int n) {
        for (int i = 0; i < n; i++) { // maximal n Schritte, Minimum n Schritte
            System.out.println(i);
        }
    }

    // Ω(n) - Omega Notation: Wir sagen, dass ein Algorithmus in Ω(n) ist,
    // wenn seine Ausführungszeit mindestens proportional zur Anzahl der Eingabeelemente (n) ist.
    static boolean omegaNotation(int[] array, int n) {
        for (int i = 0; i < array.length; i++) { // maximal array.length (n) Schritte, Minimum 1 Schritt
            if (array[i] == n) {
                return true;
            }
        }
        return false;
    }

    // Θ(n) - Theta Notation: Wir sagen, dass ein Algorithmus in Θ(n) ist,
    // wenn seine Ausführungszeit genau Anzahl der Eingabeelemente (n) ist.
    static void thetaNotation(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Hallo");
        }
    }

    // Example for O, Ω, and Θ notations
    // example1(n) € O(n)
    // example1(n) € Ω(n)
    // daraus --> example1(n) € Θ(n)
    static void example1(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Hi");
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Hi");
        }
    }

    // o(n) - Little O Notation: Wir sagen, dass ein Algorithmus in o(n) ist,
    // wenn seine Ausführungszeit asymptotisch KLEINER als die Anzahl der Eingabeelemente (n) ist.
    // littleONotation(n) € o(n)
    static void littleONotation(int n) {
        for (int i = 1; i <= n; i *= 2) { // i wächst exponentiell, daher sind die Schritte kleiner als n
            System.out.println("HI");
        }
    }

    // ω(n) - Little Omega Notation: Wir sagen, dass ein Algorithmus in ω(n) ist,
    // wenn seine Ausführungszeit asymptotisch GRÖßER als die Anzahl der Eingabeelemente (n) ist.
    // littleOmegaNotation(n) € ω(n^2)
    static void littleOmegaNotation(int n) {
        for (int i = 0; i < n; i++){
           for(int j = 0; j < n; j++) {
               System.out.println("HI");
            }
        }
    }
}
