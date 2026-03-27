package day1practise;
import java.util.Scanner;

public class q12 {
    public static void main(String[] args) { // Fixed signature
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st no: ");
        int x = sc.nextInt(); // Fixed .nextInt()

        System.out.print("Enter 2nd no: ");
        int y = sc.nextInt();

        System.out.print("Enter 3rd no: ");
        int z = sc.nextInt();

        int largest = (x > y) ? (x > z ? x : z) : (y > z ? y : z);

        System.out.println("The largest number is: " + largest);

        sc.close();

    }
}