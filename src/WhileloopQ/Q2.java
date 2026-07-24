package WhileloopQ;
// sum of digit of a no
public class Q2 {
    static void main(String[] args) {
        int n = 76578;
        int sum = 0;
        while(n != 0){
            int lastDigit = n%10;
            // task of digith
            sum = sum + lastDigit;
            n = n /10;

        }
        System.out.println(sum);
    }
}
