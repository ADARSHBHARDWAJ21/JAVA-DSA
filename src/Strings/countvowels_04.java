package Strings;
import java.util.Scanner;

public class countvowels_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                count++;
            }
        }

        System.out.println("Total number of vowels: " + count);
        sc.close(); // Good practice to close the scanner
    }

    public static boolean isVowel(char ch) {
        // Convert to lowercase to simplify the check
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}