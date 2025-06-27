package Datenstrukturen.Listen.SimpleLinkedList;

public class Main {
    public static void main(String[] args) {
        SimpleLinkedList list = new SimpleLinkedList();

        System.out.println("Is List Empty?  --> " +  list.isEmpty());
        System.out.println("Size: " + list.size());

        list.append("Farah");
        list.append("Hanan");
        list.append("Ousama");
        list.append("Al Hamada");

        list.print(); // [Farah, Hanan, Ousama, Al Hamada]

        System.out.println("Is List Empty?  --> " +  list.isEmpty());


        System.out.println("Size: " + list.size());

        list.insert("Ali", -1);
        list.insert("Ali", 0); // insert ali at head!

        list.print();
        System.out.println("Size: " + list.size());

        list.insert("Sara", 5);
        list.print();
        System.out.println("Size: " + list.size());

        list.insert("Lara", 50);
        list.print();
        System.out.println("Size: " + list.size());

        list.insert("Yahya", 3);
        list.print();
        System.out.println("Size: " + list.size());

        boolean saraExists = list.search("Sara");
        System.out.println("Sara exists? " + saraExists);

        boolean thomasExists = list.search("Thomas");
        System.out.println("Thomas exists? " + thomasExists);

        list.remove("Yahya");
        list.print();
        System.out.println("Size: " + list.size());

        list.remove("Ali"); // delete head!
        list.print();
        System.out.println("Size: " + list.size());

        list.remove("Lara"); // delete last!
        list.print();
        System.out.println("Size: " + list.size());


        list.append("Thomas");
        list.append("Müller");
        list.append("Messi");

        list.remove(-1); // invalid index!
        list.remove(0); // remove head
        list.print();
        System.out.println("Size: " + list.size());

        list.remove (7); // remove end
        list.print();
        System.out.println("Size: " + list.size());

        list.remove (50); //remove  end
        list.print();
        System.out.println("Size: " + list.size());

        list.remove(3); // remove index 3
        list.print();
        System.out.println("Size: " + list.size());
    }
}

