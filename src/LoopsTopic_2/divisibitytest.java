package LoopsTopic_2;
import java.util.Scanner;
public class divisibitytest {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int x = sc.nextInt();
        if( x% 5 == 0){
            System.out.println("It is divisible by 5");


        }
        else{
            System.out.println("It is not divisible by 5 ");
        }

    }
}
