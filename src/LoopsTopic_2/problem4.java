package LoopsTopic_2;
import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter cost price");
        int cp = sc.nextInt();

        System.out.println("Enter selling price");
        int sp = sc.nextInt();

        if (sp > cp) {
            System.out.print("Your profit is : ");
            System.out.println(sp-cp);
        } else  {
                System.out.println("You incurred  loss is : ");
                int loss = cp-sp;
            System.out.println(loss);

        }
    }
}
