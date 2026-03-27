// find gp of n terms and display 3 , 12 , 48 , 192 , 768
package LoopsTopic_2;
import java.util.Scanner;
public class Forloop_10 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int a = 3, r = 4;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(a+" ");
            a *=r ;
            
        }
    }
}
