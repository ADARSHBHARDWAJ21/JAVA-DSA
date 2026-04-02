package Arrays;
import java.util.Scanner;

public class Arrays_03 {
    // Added 'public' so the JVM can run it
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        // Initialize the array once
        int[] arr = new int[n];

        System.out.println("Enter array Elements: ");
        // Single loop to fill the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // print only -ve elements
        System.out.print("Array elements are: ");
        for (int i=0; i<n; i++ ) {
           if(arr[i]<0) System.out.print(arr[i]+ " ");
        }


    }
}