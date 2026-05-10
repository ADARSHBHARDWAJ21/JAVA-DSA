package Strings;
import java.util.Scanner;
public class integertostring_09 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        String s = "";
        s += n;
        String t = Integer.toString(n);
        System.out.println(s);
        System.out.println(s.length());
    }
}
