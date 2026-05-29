// reverse each word in a given sentence
package Strings;
import java.util.Scanner;

public class reverse_19 {
    // 1. Added 'public' so the program can actually run
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());

        // 2. Modified indices: 0 is the start, sb.length() - 1 is the end
        reverse(sb, 0, sb.length() - 1);

        System.out.println(sb);
    }

    public static void reverse (StringBuilder sb , int i , int j){
        while( i<=j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++; j--;
        }
    }
}