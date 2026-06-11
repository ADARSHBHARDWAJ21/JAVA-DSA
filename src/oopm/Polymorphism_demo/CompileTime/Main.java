package oopm.Polymorphism_demo.CompileTime;

public class Main {
    static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println(c.add(10, 20));

        System.out.println(c.add(10, 20, 30));
    }
}
