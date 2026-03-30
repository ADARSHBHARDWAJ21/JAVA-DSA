package Patterns;

import java.util.Scanner;

public class pluspattern {
    public static void main(String[] args) { // Added public and String[] args
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd number for the size: ");
        int m = sc.nextInt();

        // For a perfect plus, m should be odd.
        // If m = 5, mid = 3.
        int mid = (m / 2) + 1;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) { // Changed j to start at 1 to match i
                // If we are in the middle row OR middle column, print a star
                if (i == mid || j == mid) {
                    System.out.print("* ");
                } else {
                    // Print two spaces to keep the alignment perfect
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
