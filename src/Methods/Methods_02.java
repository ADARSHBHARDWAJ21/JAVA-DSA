package Methods;
import java.util.Scanner;
public class Methods_02 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double d = sc.nextInt();

        System.out.println(Math.max(Math.max(Math.max(a,b),c),d));
    }
}
