package Patterns;

public class Pattern_05 {
    static void main(String[] args) {
        int n =5;
        for (int row = 0; row <=5 ; row++) {
            for (int col = 1; col <= n-row+1 ; col++) {
                System.out.print("* ");
            }
            // move to next row
            System.out.println();
        }
    }
}
