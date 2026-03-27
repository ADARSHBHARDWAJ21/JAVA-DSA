//Convert Celsius to Fahrenheit
package day1practise;
import java.util.Scanner;

public class q11 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temp in faranite: ");
        double x = sc.nextInt();
        double celcius = (x - 32) * 5/9;
        System.out.println( " temp in celcius is : " +celcius);

    }
}
