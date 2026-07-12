package Patterns;

public class Pattern_04 {

    public static void main(String[] args) {

        int n = 5;

        // Loop for each row
        for (int row = 1; row <= n; row++) {

            // Print leading spaces
            for (int column = 1; column <= n - row; column++) {
                System.out.print("  ");
            }

            // Print stars
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }
    }
}