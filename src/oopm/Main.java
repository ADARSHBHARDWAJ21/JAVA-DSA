package oopm;

public class Main {
    public static void main(String[] args) {

        car car1 = new car();

        car1.color = "Black";
        car1.model = "Safari";

        System.out.println(car1.color);
        System.out.println(car1.model);
        car1.startEngine();
    }
}
//This file contains the main method.
//
//public static void main(String[] args)
//
//is the entry point of the program.
//
//Java starts execution from here.
//
//This file:
//
//Creates objects
//Calls methods
//Runs the program