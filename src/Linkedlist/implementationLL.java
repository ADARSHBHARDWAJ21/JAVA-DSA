package Linkedlist;
class SLL{//USER DEFINED DATASTRUCTURE
   private Node head;
   private Node tail;
   private int size;
    void insertAtTail(int val){
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void insertAtHead(int val){
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
void display(){
    Node temp = head;
    //for (int i = 1; i <=5 ; i++) {
    while (temp != null) {
        System.out.print(temp.val+ " ");
        temp = temp.next;
    }
    System.out.println();
}
void size(){
    System.out.println("Length of Linked List is: " +size);
}
}
public class implementationLL {
    static void main(String[] args) {
       SLL list = new SLL();
  //      System.out.println(list.size);
//       list.insertAtTail(10);
//        list.insertAtTail(20);
//        list.size();
//        list.display();
//        list.insertAtTail(30);
//        list.insertAtTail(40);
//        list.size();
//        list.display();
//        list.insertAtTail(60);
//        list.insertAtTail(24);
//        list.size();
//        list.display();
//        System.out.println(list.size);
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);

        list.display();
        list.insertAtHead(567);
        list.insertAtHead(67);
        list.display();


    }
}
