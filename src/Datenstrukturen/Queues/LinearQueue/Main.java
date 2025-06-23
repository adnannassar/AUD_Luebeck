package Datenstrukturen.Queues.LinearQueue;


public class Main {
    public static void main(String[] args) {
        LinearQueue linearQueue = new LinearQueue(5);
        linearQueue.enqueue('a');
        linearQueue.enqueue('b');
        linearQueue.enqueue('c');
        linearQueue.enqueue('d');
        linearQueue.enqueue('e');
        linearQueue.enqueue('f'); // Queue is full

        System.out.print("Dequeue: ");
        System.out.print(linearQueue.dequeue() + " ");
        System.out.print(linearQueue.dequeue() + " ");
        System.out.print(linearQueue.dequeue() + " ");
        System.out.print(linearQueue.dequeue() + " ");
        System.out.print(linearQueue.dequeue() + "\n");

       // linearQueue.dequeue(); // Queue is empty!
    }
}
