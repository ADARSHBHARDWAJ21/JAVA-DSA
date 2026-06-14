package Recursion;

public class FunctionCalls_01 {
static void apple() {
    System.out.println("Hii im in Apple");
}
    static void main(String[] args) {
        System.out.println("Hi , I am in main method");
        apple();
        System.out.println("Hi ,I am in main method");
    }
}

// output
//1) hii i am main method
//2) Hii im in Apple
//3)Hi , I am in main method