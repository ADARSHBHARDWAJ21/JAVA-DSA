package day1practise;
import java.util.Scanner;
public class q9 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int radius = sc.nextInt();
        double pi = 3.1456;
        double area = pi *radius *radius ;

        System.out.println("The area of circle is: " +area);

    }
}
