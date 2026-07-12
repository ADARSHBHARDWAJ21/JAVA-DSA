package revesion.java01;

public class Patterns {
    static void main(String[] args) {
        // 3 row 4 column pattern
        for (int i = 0; i < 3 ; i++) {
            for (int j = 1; j < 4; j++) {
                //System.out.print("* ");

            }
           // System.out.println("* ");

        }

        // solid square pattern
        // n = no of rows
        //int n = 8;
//        for (int row = 1; row<=n ; row++) {
//            for (int col =1; col <=n ; col++) {
//               // System.out.print("* ");
//
//            }
//            //System.out.println("* ");
//
//        }
        // Solid rectangle
        for (int row = 1; row <= 3 ; row++) {
            for (int col = 1; col <=5 ; col++) {
                //System.out.print("* ");

            }
           // System.out.println("* ");

        }
        // print right angle triangle
        int n = 5;
        for (int row = 1; row <=n; row++) {
            for (int column = 1; column <=5 ; column++) {
                System.out.println("* ");

            }
            System.out.println("* ");

        }
    }
}
