package oopm.counstructoroverloading;


public class car {

    String color;
    String model;

    car() {
        System.out.println("Default Constructor");
    }

    car(String color) {
        this.color = color;
    }

    car(String color, String model) {
        this.color = color;
        this.model = model;
    }
}