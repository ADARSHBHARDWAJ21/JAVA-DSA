//Square and cube of a number
package day1practise;
import java.util.Scanner;
public class q13 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        double x =  sc.nextInt();
         double y = x*x*x;
         double z = x*x;
        System.out.println("The cube of the  no is:  " +y);
        System.out.println("The square of the no is: "+z);



    }
}
