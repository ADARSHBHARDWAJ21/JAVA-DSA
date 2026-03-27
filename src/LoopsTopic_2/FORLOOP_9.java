// display Ap- 13578.. upto n terms

package LoopsTopic_2;
import java.util.Scanner;
public class FORLOOP_9 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no n : ");
        int n = sc.nextInt();
//        for(int i=1; i<=2*n-1; i+=3)
//            System.out.println(i);

        int a = 4, d = 3;
        for(int i=1;i<=n;i++){
            System.out.print(a+ " ");
            a += d;
        }
    }
}

