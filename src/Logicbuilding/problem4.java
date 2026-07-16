package Logicbuilding;
// check whether a no is prime no or not
public class problem4 {
    static boolean isPrimeOrNot(int num){
       // for (int i = 2; i*i <num ; i++) {
            for (int i = 2; i <num-1 ; i++) {
            if(num%i==0){

                return false;
            }

        }
        return true;
    }
    static void main(String[] args) {
        int num = 37;
        System.out.println(isPrimeOrNot(num));

    }
}
