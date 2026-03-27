package LoopsTopic_2;
import java.util.Scanner;

public class oddeven {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no : ");
        int n = sc.nextInt();

        if (n%2==0) {
            System.out.println("The no is even");


        }
        else{
            System.out.println("The no is odd");
        }
//        if(n%2!=0){
//            System.out.println("the no is odd");
//        }
    }
}
