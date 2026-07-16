package Logicbuilding;
// count all digits of a no
public class problem_02 {
    static  int sumOfdigit(int num) {
        int sum = 0;
        while (num != 0) {
            int digit =  num%10 ;
            sum = sum + digit;
            num = num/10;
        }
        return sum;
    }
    static int countdigis(int num){
        int count = 0;

        while(num!= 0){
            int digit = num % 10;

            count++;
            num = num/10;

        }
        return count;
    }
    static void main(String[] args) {
         int num = 43453;
         int ans = countdigis(num);
         int sum = sumOfdigit(num);
        System.out.println(sum);
        System.out.println(ans);
    }
}
