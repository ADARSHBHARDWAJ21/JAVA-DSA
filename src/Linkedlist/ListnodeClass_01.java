package Linkedlist;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
public class ListnodeClass_01 {
    

    public static void main(String[] args) {
     Node a = new Node(10);
     Node b = new Node(20);
     Node c = new Node(30);
     Node d = new Node(40);
     Node e = new Node(50);

        System.out.println(a);
        System.out.println(a.val);
        System.out.println(a.next);
        System.out.println(b);
        System.out.println(b.val);
        System.out.println(b.next);
        // linking one node to another
        a.next = b; // 10->20
        System.out.println(b);
        System.out.println(a.next);
        b.next = c; //10->20->30
        c.next = d; //10->20->30->40
        d.next = e; // 10->20->30->40->50
        //printing all values
//        System.out.println(a.val);
//        System.out.println(a.next.val);
//        System.out.println(a.next.next.val);
//        System.out.println(a.next.next.next.val);
//        System.out.println(a.next.next.next.next.val);
//        Node temp = a;
//        System.out.println(temp.val);
//        temp = temp.next;
//        System.out.println(temp.val);
        Node temp = a;
        //for (int i = 1; i <=5 ; i++) {
         while(temp!=null){
            System.out.println(temp.val);
             temp = temp.next;
        }

    }

}
