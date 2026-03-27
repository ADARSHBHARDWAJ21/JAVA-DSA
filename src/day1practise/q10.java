//. Calculate simple interest (input: principal, rate, time)
package day1practise;
import java.util.Scanner;

public class q10 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter principle amount: ");
        double principle =  sc.nextInt();
        System.out.print("Enter rate : ");
        double rate = sc.nextInt();
        System.out.print("Enter time : ");
        double time = sc.nextInt();
        double simpleintrest =  (principle*rate*time)/100;
        System.out.println("The simple intrest of your amount is: " +simpleintrest);

    }
}
