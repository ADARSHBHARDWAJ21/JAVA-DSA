package OOPM.polymorphism;

public class Main {
    static void main(String[] args) {
        //Calculator c = new Calculator();
//        System.out.println(c.add(3,4));
//        System.out.println(c.add(4,5,6));
//        System.out.println(c.add(356,45,24,434));

        // runtime polymorphism
        Circle c = new Circle();
        c.draw();
        rect r = new rect();
        r.draw();

    }
}
