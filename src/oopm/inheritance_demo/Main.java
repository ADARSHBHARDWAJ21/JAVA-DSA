package oopm.inheritance_demo;

public class Main {
    static void main(String[] args) {
        Car c1 = new Car();

        c1.brand = "Tata";
        c1.noOfDoors = 5;
        c1.startEngine();

        System.out.println(c1.brand);
        System.out.println(c1.noOfDoors);
    }

}
