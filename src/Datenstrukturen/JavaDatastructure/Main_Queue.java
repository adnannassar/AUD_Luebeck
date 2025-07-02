package Datenstrukturen.JavaDatastructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main_Queue
{
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);


        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
