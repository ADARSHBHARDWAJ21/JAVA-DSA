package Methods;

public class Method_04 {
    static void main(String[] args) {
       // System.out.println("ADARSH");
        riyanshi();

    }

    public static void riyanshi() {
        System.out.println("Ajay");
        shravan();

    }
    public static void shravan(){
        karan();
        System.out.println("Khushi");
    }

    public static void karan() {
        System.out.println("YASHIKA");

    }
}

//Here is the step-by-step execution flow:
//
//        1. riyanshi() is called
//The first line is System.out.println("Ajay");.
//
//Output: Ajay
//
//Then, it calls shravan(). riyanshi pauses here.
//
//2. shravan() starts
//The first line inside shravan() is a call to karan().
//
//Crucial Point: shravan() cannot print "Khushi" yet because it hasn't reached that line. It must go into karan() first. shravan pauses here.
//
//        3. karan() starts
//The only line is System.out.println("YASHIKA");.
//
//Output: YASHIKA
//
//karan() is now finished. Control goes back to the method that called it (shravan).
//
//        4. shravan() resumes
//Now that karan() is done, shravan() moves to its next line: System.out.println("Khushi");.
//
//Output: Khushi
//
//shravan() is now finished. Control goes back to riyanshi.
//
//5. riyanshi() resumes
//There are no more lines after shravan(), so the program ends.