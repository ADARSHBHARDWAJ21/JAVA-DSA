package Strings;
import java.util.Scanner;

public class Inputandupdatepositioninstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();


        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                result += 'a';
            } else {
                result += str.charAt(i);
            }
        }

        System.out.println("Modified string: " + result);
        sc.close();
    }
}