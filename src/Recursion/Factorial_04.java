package Recursion;
import java.util.Scanner;
public class Factorial_04 {
   public static int fact(int n) {
       if(n==1) return 1; // base case
       int ans = n* fact(n-1);
       return ans; // call

   }

    static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println(fact(n));

    }
}
