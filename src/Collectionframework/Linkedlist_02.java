package Collectionframework;

import java.util.ArrayList;
import java.util.LinkedList;

public class Linkedlist_02 {
    static void main(String[] args) {
        LinkedList<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(11);
        linkedlist.add(12);
        linkedlist.add(14);
        linkedlist.add(23);
        System.out.println(linkedlist.get(2));
         //Linked list as queue and dequeue
        //addFirst and addLast
        LinkedList<Integer>ll = new LinkedList();
        ll.add(10);
        System.out.println(ll);
        ll.addFirst(1); // use to add element in first
        System.out.println(ll);
        ll.addLast(101);  // use to add element in last
        System.out.println(ll);

        //remove first // remove last
        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);

        //getFirst() , getLast()
        System.out.println(ll.getLast());
        System.out.println(ll.getFirst());
        // peak // poll  // offer
        System.out.println(ll.peek()); // prints the 1st no from which linkedlist is starting
        System.out.println(linkedlist.poll()); // returns the 1st starting element of linked list and removes that element also
        //After poll
        System.out.println(linkedlist);

        // offer - adds a specefic element at the end of the linked list

        System.out.println(linkedlist.offer(70));
        System.out.println(linkedlist);
        // JAVA VECTOR

    }
}
