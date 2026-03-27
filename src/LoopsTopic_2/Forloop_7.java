package LoopsTopic_2;
import java.util.Scanner;
public class Forloop_7 {
    static void main() {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the no : ");
        int n = sc.nextInt();
        for(int i =1; i<= n*10; i++){
            if(i%n==0) System.out.println(i);

        }
    }
}
