package Patterns;

import java.util.Scanner;

public class HorizontalTriangle {
    // Note: Added 'public' and 'String[] args' so the program can actually run
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= m; i++) {
            // Inner loop for columns: starts at m and decreases as i increases
            for (int j = 1; j <= m + 1 - i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after each row
            System.out.println();
        }

        sc.close(); // Good practice to close the scanner
    }
}