package inputinjava;
import java.util.Scanner;
public class charinput {
    static void main() {
        Scanner sc = new Scanner(System.in);
        char ch = 'a';
        System.out.println(ch);
        int a=5,b=2;
        int c = ++a + b++;
        System.out.println(c);
    }
}
