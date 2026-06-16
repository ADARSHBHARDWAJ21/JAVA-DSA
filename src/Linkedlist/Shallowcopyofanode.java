package Linkedlist;
public class Shallowcopyofanode {
    static void main(String[] args) {
        Node a = new Node(100);
        System.out.println(a.val);
        Node temp = a; // shallow copy
       // Node temp = new Node(100); // deep copy
        temp.val = 12;
        System.out.println(a);
        System.out.println(temp);
        System.out.println(a.val);

    }
}
