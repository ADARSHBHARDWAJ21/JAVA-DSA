package LoopsTopic_2;
import java.util.Scanner;
public class while_loop3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        while(num  != -1){
            sum += num;
            num = sc.nextInt();

        }
        System.out.println(sum);
    }
}
