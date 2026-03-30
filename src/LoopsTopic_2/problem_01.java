//count the no of digits for a given number n

package LoopsTopic_2;
import java.util.Scanner;
public class problem_01 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numOfDigiths = 0;
        while (n > 0) {
            n = n / 10;
            numOfDigiths++; //numof Digiths = numOfDigith+1
        }
        System.out.println("Number of digits in " + n + "=" + numOfDigiths);
    }
}


