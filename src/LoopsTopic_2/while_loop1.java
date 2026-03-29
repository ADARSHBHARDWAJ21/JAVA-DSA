// print n natrural nos
package LoopsTopic_2;
import java.util.Scanner;
public class while_loop1 {
    static void main() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the num");
        int n = sc.nextInt();
        int num = 1;
        while(num <= n ) {
            System.out.println(num);
            num = num + 1;
        }
        }
    }

