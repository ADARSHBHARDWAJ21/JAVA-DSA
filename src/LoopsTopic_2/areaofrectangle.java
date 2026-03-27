package LoopsTopic_2;
import java.util.Scanner;

public class areaofrectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of rectangle: ");
        int len = sc.nextInt();

        System.out.println("Enter breadth of rectangle : ");
        int bre = sc.nextInt();

        int per = 2 * (len + bre);
        int area = len * bre;

        System.out.println("Perimeter of rectangle is : " + per);
        System.out.println("Area of rectangle is : " + area);

        if (per > area) {
            System.out.println("Perimeter is bigger than area");
        } else if (per < area) {
            System.out.println("Perimeter is smaller than area");
        } else {
            System.out.println("Area and Perimeter are equal");
        }
    }
}