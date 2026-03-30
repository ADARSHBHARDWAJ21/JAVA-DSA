package Patterns;

import java.util.Scanner;

public class HOLOOWRECTANGLE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter no of columns: ");
        int n = sc.nextInt();

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // Check if we are on the boundary (First/Last Row or First/Last Column)
                if (i == 1 || i == m || j == 1 || j == n) {
                    System.out.print("* ");
                }
                // Fill the hollow part with "# " (Note the space after the #)
                else {
                    System.out.print("  "); // make space for hollow  or write # for filling hollow
                }
            }
            // Move to the next line after finishing the columns for that row
            System.out.println();
        }
        sc.close();
    }
}