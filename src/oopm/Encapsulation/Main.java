package oopm.Encapsulation;

public class Main {
    static void main(String[] args) {
        Student s1 = new Student();
       // s1.age = 19;
        s1.setAge(19);

        System.out.println(s1.getAge());
    }
}
