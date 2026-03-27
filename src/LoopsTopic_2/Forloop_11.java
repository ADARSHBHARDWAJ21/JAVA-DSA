//wap to find the highest factor of a number 'n'(other then n itself')

package LoopsTopic_2;
import java.util.Scanner;
public class Forloop_11 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter tne value of n : ");
         int n = sc.nextInt();
         int hf = 1;
        for (int i = n; i<n-1; i--) {
            if (n % i == 0) {//i is factor of n
                hf = i;
                break;

            }
        }
                System.out.println(hf);

        }
    }

