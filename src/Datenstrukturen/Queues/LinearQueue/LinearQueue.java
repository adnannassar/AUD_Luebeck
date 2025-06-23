package Datenstrukturen.Queues.LinearQueue;

public class LinearQueue {
    private char[] array;
    private int first;
    private int last;


    public LinearQueue(int size) {
        this.array = new char[size];
        this.first = -1;
        this.last = -1;
    }

    public boolean isEmpty() {
        return first == -1 && last == -1;
    }

    public boolean isFull() {
        return last == array.length - 1;
    }

    public void enqueue(char value) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            last++;
            array[last] = value;
        }
    }

    public char dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return ' ';
        } else {
            first++;
            return array[first];
        }
    }
}
