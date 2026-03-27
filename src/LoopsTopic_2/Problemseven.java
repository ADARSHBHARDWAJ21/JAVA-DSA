package LoopsTopic_2;
import java.util.Scanner;

public class Problemseven {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int no = sc.nextInt();

        if( no%5==0 && no%3==0){
            System.out.println(" it is divisible by both 5 and 3 ");

        }else{
            System.out.println("Not divisible by both 5 and 3");
        }

    }
}
