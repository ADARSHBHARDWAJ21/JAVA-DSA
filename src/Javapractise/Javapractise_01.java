package Javapractise;
import java.util.Scanner;
public class Javapractise_01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // initilizattion of array
        System.out.print("Enter size of Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements : ");
        //loop for entering elements
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
            System.out.println("Array elements are : ");
        // loop for printing elements
            for (int i= 0; i <n ; i++){
                if(arr[i]>0){
                    System.out.println(arr[i]+ " ");


            }

        }
    }
}
