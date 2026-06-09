package OOPM;
 // class declaration
//class STUDENT {
//    String name;
//    int age;
//}

//// DISPLAY METHOD CREATION
//class STUDENT {
//
//    String name;
//    int age;
//    //counstructor
//    STUDENT() {
//        System.out.println("Student Object Created");
//    }
//
//    void display() {
//        System.out.println(name);
//        System.out.println(age);
//    }
//}
    // parametrized counstructor
class STUDENT {

    private String name;      // used private so that name and age has private access in STUDENT  now data is protected this is encapsulation

    private int age;
    static String college = "LNCT";

    STUDENT() {
        System.out.println("Student Object Created");
    }

    STUDENT(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(college);
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating an object of the STUDENT class
        //STUDENT s1 = new STUDENT();
        STUDENT s1 = new STUDENT("Adarsh", 19);
        STUDENT s2 = new STUDENT("akash" , 23);
        STUDENT s3 = new STUDENT("Rahul", 20);
        STUDENT s4 = new STUDENT("Aman", 21);
        STUDENT s5 = new STUDENT("Rohit", 22);
        // Assigning values
//        s1.name = "Adarsh";
//        s1.age = 19;


//        // Printing values
//        System.out.println(s1.name);
//        System.out.println(s1.age);


        // METHOD CALLING
        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}