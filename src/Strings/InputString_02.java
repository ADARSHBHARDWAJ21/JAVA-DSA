package Strings;
import java.util.Scanner;
public class InputString_02 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        //String str = sc.next();  // use to take input of a single word if it detects space it stops taking input
        String str = sc.nextLine();
        System.out.println("Hi ");
        System.out.println(str);
    }
}
