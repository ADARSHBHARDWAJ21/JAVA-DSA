package Recursion;
import java.util.Scanner;
public class Printdecreasingno_04 {
    public static void print(int n) {
        System.out.println(n);
        if (n==0) return;
        print(n-1);

    }
        static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter value of n :  ");
            int n = sc.nextInt();
            print(n);
        }
    }
