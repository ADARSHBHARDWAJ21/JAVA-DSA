package Strings;
import java.util.Scanner;
public class InputString_02 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        //String str = sc.next();
        String str = sc.nextLine();
        System.out.println("Hi ");
        System.out.println(str);
    }
}
