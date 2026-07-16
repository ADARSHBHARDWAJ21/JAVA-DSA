package Logicbuilding;

public class problem6 {
    static boolean isarmstrongnumber(int num){
        int sum = 0;
        int originalNum = num;
        while(num!=0){
            int digit = num % 10;
            int cubeOfDigit = digit*digit*digit;
            sum = sum+cubeOfDigit;
            //digit remove from num
            num = num/10;
        }
        if(sum == originalNum){
            return true;
        }
        else{
            return false;
        }
    }
    static void main(String[] args) {
        System.out.println(isarmstrongnumber(155));

    }
}
