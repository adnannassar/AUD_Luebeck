package Extras;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before Swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int old_a = a;
        a = b;
        b = old_a;

        System.out.println("After Swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

    public static void swap(int[]  array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
