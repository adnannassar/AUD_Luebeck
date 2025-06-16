package Datenstrukturen.Stack;

public class Main {
    public static void main(String[] args) {
        StackAud stackAud = new StackAud(5);
        stackAud.push(1);
        stackAud.push(2);
        stackAud.push(3);
        stackAud.push(4);
        stackAud.push(5);
        stackAud.push(6); // stack ist full!
        System.out.print("Pop: ");
        System.out.print(stackAud.pop() + " ");
        System.out.print(stackAud.pop() + " ");
        System.out.print(stackAud.pop() + " ");
        System.out.print(stackAud.pop() + " ");
        System.out.print(stackAud.pop() + "\n");
        stackAud.pop(); // stack is empty!
    }
}
