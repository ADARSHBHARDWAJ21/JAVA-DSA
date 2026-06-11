package oopm.counstructor.demo;

public class main {
    public static void main(String[] args) {
           // filling black and fortuner for parametrized counstructor
        car car1 = new car("Black", "Fortuner");
        System.out.println(car1.color);
        System.out.println(car1.model);

    }
}
