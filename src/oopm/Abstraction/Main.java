package oopm.Abstraction;

public class Main {
    public static void main(String[] args) {

        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.startEngine();
        v2.startEngine();
    }
}
