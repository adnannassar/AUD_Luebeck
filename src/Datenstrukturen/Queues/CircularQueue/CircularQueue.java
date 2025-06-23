package Datenstrukturen.Queues.CircularQueue;

public class CircularQueue {
    private char[] array;
    private int first;
    private int last;

    public CircularQueue(int size) {
        this.array = new char[size];
        this.first = -1;
        this.last = -1;
    }

    public boolean isEmpty() {
        return (first == -1 && last == -1);
    }

    public boolean isFull() {
        return (first == -1 && last == array.length - 1) || (first == last && first != -1);
    }

    public void enqueue(char value) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            last = (last + 1) % array.length;
            array[last] = value;
        }
    }

    public char dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return ' ';
        } else {
            first = (first + 1) % array.length;
            char temp = array[first];
            // sonderfall --> reset the pointers!
            if (first == last) {
                first = -1;
                last = -1;
            }

            return temp;
        }
    }
}
