package LoopsTopic_2;
import java.util.Scanner;
public class threedigithno {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num>99 && num<999){
            System.out.println("It is a 3 digith no");

        } else {
            System.out.println("Not a 3 digith no");
        }

    }
}
