package LoopsTopic_2;
import java.util.Scanner;
public class whileloop_02 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n :");
        int n = sc.nextInt();
        int num = 1;
        int sum = 0;
         while(num<=n){
             sum = sum+num;
             num++;
         }
        System.out.println(sum);
    }
}
