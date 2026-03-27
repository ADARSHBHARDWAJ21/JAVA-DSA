package LoopsTopic_2;
import java.util.Scanner;

public class problem12 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int num = sc.nextInt();
//        if((num%5 == 0 || num%3 == 0) && num%15 != 0 ){
//            System.out.println("The no is divisible by 5 or 3 but not by 15: "+num);
//
//
//        }else{
//            System.out.println("the num is divisible by all three of them ");
//        }

        if(num%5 == 0  || num%3 == 0){

            if(num%15!=0){
                System.out.println("The number is divisible by 3 or 5 but not 15");
            }
            else{
                System.out.println("not matching the required condition");
            }

        }
        else {
            System.out.println("Not matching required condition");
        }
    }
}
