package Datenstrukturen.Stack;

// Komplexität von insert (push): O(1)
// Komplexität von lesen (pop): O(1)

public class StackAud {
    private int[] array;
    private int last;

    public StackAud(int size) {
        this.array = new int[size];
        this.last = -1;
    }

    public boolean isEmpty() {
        return last == -1;
    }

    public boolean isFull() {
        return last == array.length - 1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            last++;
            array[last] = value;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int temp = array[last];
            last--;
            return temp;
        }
    }
}
