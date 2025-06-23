package Datenstrukturen.Arrays.DynamicArray;

public class Main
{
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.add(4);
        dynamicArray.add(2);

        dynamicArray.printDynamicArray();

        dynamicArray.add(1);
        dynamicArray.printDynamicArray();
        dynamicArray.add(3);
        dynamicArray.printDynamicArray();

        dynamicArray.remove(0);

        dynamicArray.printDynamicArray();
        dynamicArray.add(10);
        dynamicArray.printDynamicArray();
        dynamicArray.add(6);
        dynamicArray.printDynamicArray();
        dynamicArray.add(8);
        dynamicArray.add(7);
        dynamicArray.add(5);
        dynamicArray.add(9);
        dynamicArray.printDynamicArray();
        dynamicArray.add(80);
        dynamicArray.add(70);
        dynamicArray.add(50);
        dynamicArray.add(90);
        dynamicArray.add(100);
        dynamicArray.add(101);
        dynamicArray.add(102);
        dynamicArray.printDynamicArray();
        dynamicArray.add(110); // 4 byte
        dynamicArray.printDynamicArray();

    }
}
