package day1practise;
import java.util.Scanner;
public class q1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
            String name = sc.nextLine();
        System.out.println("Hello " +name);
        sc.close();
    }
}
