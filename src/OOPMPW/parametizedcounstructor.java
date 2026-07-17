package OOPMPW;

public class parametizedcounstructor {
    static void main(String[] args) {
        Student s1 = new Student("Adarsh", 20);
        s1.display();
    }
    static class Student {

        String name;
        int age;

        // Parameterized Constructor
        Student(String n, int a) {
            name = n;
            age = a;
        }

        void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }

    }
}
