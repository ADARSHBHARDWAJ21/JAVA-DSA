package Arrays;
import java.util.Scanner;
public class Array_inp_output02 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {5,-8,2,67,43,-97}; // length 6 //index goes to - 0 to n-1
        for (int i=0; i<=5;  i++){
            //System.out.print(arr[i]+" ");

        }
        //default value 7 0s will be printed in output
        int[]ka = new int[7]; // by default array is 0
        // default values
//       for (int i = 0; i <7 ; i++) {
//            System.out.println(ka[i]+" ");
//
//        }
        // input in array
        for (int i=0; i<7;i++){
//            int x = sc.nextInt();
//            ka[i]= x;
            ka[i]= sc.nextInt();
        }
     // print
        for(int i =0; i<7; i++){
            //System.out.print(ka[i]+ " ");
        }
        // print 2x of the original value
        for(int i =0; i<7; i++){
           // System.out.print(2*ka[i]+ " ");
        }

        // print convert into -ve arrays only
        for (int i = 0; i <7; i++) {
           // System.out.println(-1*ka[i]+ " ");

        }
    }
}
