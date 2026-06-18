package Linkedlist;

// User Defined Singly Linked List
class SLL {

    private Node head; // BY DEFAULT AT NULL
    private Node tail; // BY DEFAULT AT NULL
    private int size;

    // Insert at Head
    void insertAtHead(int val) {

        Node temp = new Node(val);

        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }

        size++;
    }

    // Insert at Tail
    void insertAtTail(int val) {

        Node temp = new Node(val);

        if (head == null) {
            head = tail = temp; // BASE CASE IF LINKED LIST IS EMPTY
        } else {
            tail.next = temp;   // IF LINKED LIST IS NOT EMPTY
            tail = temp;
        }

        size++;
    }

    // Insert at any index
    void insert(int idx, int val) {

        if (idx < 0 || idx > size) {
            System.out.println("Invalid Index!");
            return;
        }

        if (idx == 0) {
            insertAtHead(val);
            return;
        }

        if (idx == size) {
            insertAtTail(val);
            return;
        }

        Node temp = new Node(val);
        Node x = head;

        for (int i = 1; i < idx; i++) {
            x = x.next;
        }

        temp.next = x.next;
        x.next = temp;

        size++;
    }

    // Get element at index
    int get(int idx) {

        if (idx < 0 || idx >= size) {
            System.out.println("Invalid Index!");
            return -1;
        }

        Node temp = head;

        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }

        return temp.val;
    }

    // Delete first node
    void deleteAtHead() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }

        size--;
    }

    // Delete last node
    void deleteAtTail() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
            size--;
            return;
        }

        Node temp = head;

        while (temp.next != tail) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;

        size--;
    }
    void delete(int idx) {

        // Invalid index check
        if (idx < 0 || idx >= size) {
            System.out.println("Invalid Index!");
            return;
        }

        // Delete first node
        if (idx == 0) {
            deleteAtHead();
            return;
        }

        // Delete last node
        if (idx == size - 1) {
            deleteAtTail();
            return;
        }

        // Reach node just before the node to be deleted
        Node temp = head;

        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }

        // Skip the node at index idx
        temp.next = temp.next.next;

        size--;
    }
    // Display Linked List
    void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    // Print size
    void printSize() {
        System.out.println("Size = " + size);
    }
}


// Driver Class
public class implementationLL {

    public static void main(String[] args) {

        SLL list = new SLL();

        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);

        list.insertAtHead(567);
        list.insertAtHead(67);

        list.insert(2, 100);
        list.insert(4, 80);

        System.out.println("Original List:");
        list.display();

        System.out.println("Element at index 2: " + list.get(2));

        list.deleteAtHead();
        System.out.println("After deleteAtHead():");
        list.display();

        list.deleteAtTail();
        System.out.println("After deleteAtTail():");
        list.display();

        list.printSize();
        list.delete(3);
        list.display();
    }
}