package day1practise;
import java.util.Scanner;

public class q8 {
    // 1. Fixed the main method signature
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        // 2. Fixed sc.next.Int() to sc.nextInt()
        int num = sc.nextInt();

        // 3. Logic for Even/Odd without if-else
        String result = (num % 2 == 0) ? num + " is Even" : num + " is Odd";

        System.out.println(result);

        sc.close();
    }
}