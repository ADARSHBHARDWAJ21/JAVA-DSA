package revesion.java01;

public class LOOPS {
    static void main(String[] args) {
        //loops types
        //for
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);

        }
        for (int i = 0; i <= 100; i++) {
            // System.out.println("Adarsh bhardwaj");
        }
        //nested loop
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i = " + i + " j = " + j);

            }
            System.out.println();

        }

        //break && continue
//        for (int i = 1; i <= 10; i++) {
//            if (i == 1 || i == 2 || i == 3 || i == 4) {
//                continue;
//            }
//            System.out.println(i);
//
//
//        }

        for (int i = 1; i <= 10; i++) {
            if (i == 1 || i == 2 || i == 3 || i == 4) {
                break;
            }
            System.out.println(i);

        }
        // While loop
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

    }
}