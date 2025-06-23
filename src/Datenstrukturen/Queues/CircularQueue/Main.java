package Datenstrukturen.Queues.CircularQueue;


import Datenstrukturen.Queues.LinearQueue.LinearQueue;

public class Main {
    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(5);
        circularQueue.enqueue('a');
        circularQueue.enqueue('b');
        circularQueue.enqueue('c');

        System.out.print(circularQueue.dequeue() + " ");
        System.out.print(circularQueue.dequeue() + " ");

        circularQueue.enqueue('x');
        circularQueue.enqueue('y');

        System.out.print(circularQueue.dequeue() + " ");
        System.out.print(circularQueue.dequeue() + " ");

        circularQueue.enqueue('z');
        circularQueue.enqueue('#');
        circularQueue.enqueue('@');
        circularQueue.enqueue('!');


        System.out.print(circularQueue.dequeue() + " ");
        System.out.print(circularQueue.dequeue() + " ");
        System.out.print(circularQueue.dequeue() + " ");
        System.out.print(circularQueue.dequeue() + " ");
        System.out.print(circularQueue.dequeue() + " ");
    }
}
