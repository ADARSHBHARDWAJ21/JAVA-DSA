package Methods;
import java.util.Scanner;
//declaration /defination
public class methods_01 {
    static void print2katable() {   // Method created
        for (int i = 1; i <=10 ; i++) {
            int ans = 2*i;
            System.out.println("-> " + ans);
            
        }

    }
    // SUM METHOD DECLARATION
    static void printSum(int x , int y){
        System.out.println("SUM: " +(x+y)); // THE DATA WHICH I RECIVED HERE IS CALEED PARAMETERS
    }
    //MULTIPLY METHOD DECLARATION
    static void printMultiplication(int a, int b){
        int ans = a*b;
        System.out.println("Result: " + ans);
    }
    //add
    static int add(int p , int q){
        int sum = p+q;
        return p+q;
    }
    static void main(){
      int result =  add(12,13);
        System.out.println("Result: " + result);
        System.out.println("hi");
        //method call
        printMultiplication(5,90);
        print2katable();
        printSum(2,5); // THE DATA WHICH I SEND IS CALLED ARGUMENTS
        System.out.println("bye");
    }
}
