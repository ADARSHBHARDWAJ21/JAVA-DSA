package WhileloopQ;

import java.util.Scanner;

// Q4 Reverse of a number
public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int rev = 0;

        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        System.out.println("Reverse Number: " + rev);
    }
}