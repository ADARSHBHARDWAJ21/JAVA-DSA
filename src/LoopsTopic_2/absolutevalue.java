package LoopsTopic_2;
import java.util.Scanner;
public class absolutevalue {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer : ");
        int n = sc.nextInt();

        if (n<0) {
            n= n*(-1);


        }

        System.out.println("The absoloute value is : " +n);

    }
}
