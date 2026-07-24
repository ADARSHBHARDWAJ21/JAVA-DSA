

package WhileloopQ;

import java.util.Scanner;

//Palindromic no
public class Q3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int original = n; // saves the original no
        int reverse = 0;  // variable created to store  reverse no


        while (n > 0) {
            int rem = n % 10;  // gives the reminder
            reverse = reverse * 10 + rem; // stores the rem no
            n = n / 10;
        }

        if (original == reverse) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }
    }

