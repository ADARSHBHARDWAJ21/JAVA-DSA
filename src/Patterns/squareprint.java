package Patterns;
import java.util.Scanner;
public class squareprint {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for (int i = 1; i <=m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
