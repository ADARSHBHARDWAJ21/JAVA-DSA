package LoopsTopic_2;
import java.util.Scanner;

public class tableinput {
    // Added 'public' here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int n = sc.nextInt();

        System.out.println("The table of " + n + " is:");

        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            // Print the result inside the loop
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}