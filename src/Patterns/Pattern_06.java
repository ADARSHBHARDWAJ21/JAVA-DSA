package Patterns;

public class Pattern_06 {
    static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n; row++) {

            // Spaces
            for (int column = 1; column <= n - row; column++) {
                System.out.print(" ");
            }

            // Stars
            for (int column = 1; column <= 2 * row - 1; column++) {
                System.out.print(" *");
            }

            // Next line
            System.out.println();
        }
    }
}