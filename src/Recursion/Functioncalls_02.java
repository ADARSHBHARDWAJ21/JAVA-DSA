package Recursion;

public class Functioncalls_02 {
    public static void mango() {
        System.out.println("Hi ,I am in mango");

    }
   public static void banana() {
        System.out.println("Hi ,I am in banana");
        mango();

    }
    public static void Apple() {
        System.out.println("Hi ,I am in apple");
        banana();

    }

    static void main(String[] args) {
        System.out.println("Hii ,I am in main");
        Apple();
    }

}
// output
//1 hii i am in main
//2 hii i am in apple
//3 hii i am in banana
//4 hii i am in mango
