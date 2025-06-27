package Datenstrukturen.Listen.SimpleLinkedList;

public class SimpleLinkedList {
    private Node_Simple head;


    public void append(String value) {
        if (isEmpty()) {
            // first add! (add the head)
            head = new Node_Simple(value, null);
        } else {
            Node_Simple newNode = new Node_Simple(value, null);
            Node_Simple ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = newNode;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }


    public void print() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            Node_Simple ptr = head;
            System.out.print("[");
            while (ptr.next != null) {
                System.out.print(ptr.value + ", ");
                ptr = ptr.next;
            }
            System.out.println(ptr.value + "]");
        }
    }

    public int size() {
        int count = 0;
        Node_Simple ptr = head;
        while (ptr != null) {
            count++;
            ptr = ptr.next;
        }
        return count;
    }

    private void addHead(String value) {
        Node_Simple newNode = new Node_Simple(value, head);
        head = newNode;
    }

    public void insert(String value, int index) {
        if (index < 0) {
            System.out.println("Index out of bounds: Index: " + index + ", Size: " + size());
        } else if (index == 0) {
            addHead(value);
        } else if (index >= size()) {
            append(value);
        } else {
            Node_Simple newNode = new Node_Simple(value, null);
            Node_Simple ptr = head;
            int i = 0;
            while (i < index) {
                ptr = ptr.next;
                i++;
            }
            newNode.next = ptr.next;
            ptr.next = newNode;
        }
    }

    public boolean search(String value) {
        Node_Simple ptr = head;
        while (ptr != null) {
            if (ptr.value.equalsIgnoreCase(value)) {
                return true;
            }
            ptr = ptr.next;
        }
        return false;
    }

    private void removeHead() {
        if (!isEmpty()) {
            head = head.next;
        }
    }

    public void remove(String value) {
        if (head.value.equalsIgnoreCase(value)) {
            removeHead();
        }
        Node_Simple ptr = head;
        Node_Simple before_ptr = head;
        while (ptr != null) {
            if (ptr.value.equalsIgnoreCase(value)) {
                before_ptr.next = ptr.next;
            }
            before_ptr = ptr;
            ptr = ptr.next;
        }
    }

    public void remove(int index) {
        if (index < 0) {
            System.out.println("Index out of bounds: Index: " + index + ", Size: " + size());
        } else if (index == 0) {
            removeHead();
        } else if (index >= size()) {
            Node_Simple ptr = head;
            Node_Simple before_ptr = head;
            while (ptr.next != null) {
                before_ptr = ptr;
                ptr = ptr.next;
            }
            before_ptr.next = null;
        } else {
            remove(getValueByIndex(index));
        }
    }

    private String getValueByIndex(int index) {
        if (index < 0) {
            return null;
        } else if (index == 0) {
            return head.value;
        } else if (index >= size()) {
            Node_Simple ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            return ptr.value;
        } else {
            Node_Simple ptr = head;
            int i = 0;
            while (i != index) {
                ptr = ptr.next;
                i++;
            }
            return ptr.value;
        }
    }
}
