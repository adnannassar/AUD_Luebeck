package Datenstrukturen.JavaDatastructure;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main_List {
    public static void main(String[] args) {
        // LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);

        System.out.println(linkedList);

        linkedList.add(3);
        System.out.println(linkedList);
        linkedList.remove(2);

        System.out.println(linkedList);

        System.out.println("Size: " + linkedList.size());


        // LinkedList
        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(1);
        arraylist.add(2);

        System.out.println(arraylist);

        arraylist.add(3);
        System.out.println(arraylist);
        arraylist.remove(2);

        System.out.println(arraylist);

        System.out.println("Size: " + arraylist.size());
    }
}
