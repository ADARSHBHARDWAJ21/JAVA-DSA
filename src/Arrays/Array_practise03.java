package Arrays;
import java.util.Scanner;
public class Array_practise03 {
     static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
       int n = sc.nextInt();
       int [] arr = new int[n];  // taking inpput from user of size of array
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();    // filling the fixed size array with values
        }
            //Printing all elements
            System.out.println("Array elements are: ");
            for (int i = 0; i < n ; i++) {
                //if(arr[i]<0) condition if required
                   // System.out.print(2*arr[i] + " ");  taking double output of original output
                System.out.println(arr[i] + " ");

            }

        }

    }

