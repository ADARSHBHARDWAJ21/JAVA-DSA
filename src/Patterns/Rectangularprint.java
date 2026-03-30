package Patterns;
import java.util.Scanner;

public class Rectangularprint {
    // Added String[] args here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter no of columns: ");
        int n = sc.nextInt();

        for (int i = 1; i <= m; i++) {
            // Changed condition to j <= n
            for (int j = 1; j <= n; j++) {
                // Changed to .print() to keep stars on one line
                System.out.print("* ");
            }
            // Moves to the next line after finishing a row
            System.out.println();
        }
    }
}
