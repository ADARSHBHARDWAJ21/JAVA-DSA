package Logicbuilding;
// GCD(HCF) OF A NUMBER
public class PROBLEM5 {
    static int getGCD(int a, int b){
        //gcd(a,b) = gcd(b, a%b)

    while(b != 0){
        int olfValueOfb = b;
        b = a%b;
        a =olfValueOfb;

    }
    int ans = a;
    return ans;
    }
    static void main() {
        System.out.println(getGCD(18, 12));

    }
}
