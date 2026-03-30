package Patterns;
import java.util.Scanner;
public class Triange2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                // If row is odd, print numbers
                if (i % 2 != 0) {
                    System.out.print(j + " ");
                }
                // If row is even, print characters (64 + 1 = 'A')
                else {
                    System.out.print((char)(j + 64) + " ");
                }
            }
            System.out.println();
        }
    }
}
