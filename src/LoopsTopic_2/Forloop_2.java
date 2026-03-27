
// printing helloworld n  no of times
package LoopsTopic_2;
import java.util.Scanner;
public class Forloop_2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of times you want to print: ");
        int n = sc.nextInt();
        int i;
        for( i=1; i<=n; i=i++){
            System.out.println("Hello world");
        }
        System.out.println(i); // the value of i is coming because we declared int i out of bracket
    }
}
