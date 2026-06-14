package Recursion;

public class Functioncalls_03 {

        public static void mango() {
            System.out.println("Hi ,I am in mango");

        }
        public static void banana() {
            mango();
            System.out.println("Hi ,I am in banana");


        }
        public static void Apple() {
            banana();
            System.out.println("Hi ,I am in apple");
            mango();

        }

        static void main(String[] args) {
            System.out.println("Hii ,I am in main");
            Apple();
        }

        //
     //1) hii i am in main
    //2) hii i am in mango
    //3) hii i am in apple
    //4)hii i am in mango
    //5)


}
