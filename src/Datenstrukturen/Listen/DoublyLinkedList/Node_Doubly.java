package Datenstrukturen.Listen.DoublyLinkedList;


public class Node_Doubly {
    String value;
    Node_Doubly next;
    Node_Doubly prev;

    public Node_Doubly(String value, Node_Doubly next, Node_Doubly prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
}
