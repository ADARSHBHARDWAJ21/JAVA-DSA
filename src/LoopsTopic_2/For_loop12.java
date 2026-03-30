// print sum of first n natural nos where n is input
package LoopsTopic_2;
import java.util.Scanner;
public class For_loop12 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of  n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int num = 1; num <= n ; num++) {
            sum = sum+num;

        }
        System.out.println("soum of num: " +sum);
    }
}
