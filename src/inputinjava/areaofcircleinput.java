
package inputinjava;
import java.util.Scanner;


public class areaofcircleinput {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" ENTER RADIUS ");
        int radius;
        radius = sc.nextInt();
        double pi = 3.1456;
        double area = pi * radius *radius;
        System.out.println("The area of circle is : " +area);
    }
}
