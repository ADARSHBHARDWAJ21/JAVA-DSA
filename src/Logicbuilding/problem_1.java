// we have to print the digit
//% gives last digith
// / removes the last digith
package Logicbuilding;

public class problem_1 {
    static void printdigits(int num){
        while(num != 0){
            int digit = num%10;
            System.out.println(digit);
            //last digit remove
            num = num/10;


        }
    }
    static void main(String[] args) {
int num = 53127;
printdigits(num);
    }
}
