package OOPMPW;

public class Student {

    String name;

    // Constructor
    Student() {
        name = "Adarsh";
        System.out.println("Constructor is called.");

    }

    void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        Student s1 = new Student(); // Constructor is called automatically
        s1.display();
    }
}
