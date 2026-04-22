package Arrays2;

import java.util.Arrays;

public class Rotatearray {
    public static void main(String[] args) {
        int[] arr = {6, 8, 1, 8, 4, 9, 0};
        int n = arr.length;

        int d = 2; // Adjusted to 2 to get your desired output start

      reverse(arr,0,d-1); // reversing part A [6,8] => [8]  line becomes[8,6,1,8,4,9,0]
      reverse(arr,d,n-1);  // now we flip (1,8,4,9,0) => [0,9,4,8,1] whole line becomes [8,6,0,9,4,8,1]
        reverse(arr,0,n-1); // now flip whole line [8,6,0,9,4,8,1] => [1,8,4,9,0,6,8]

        // Print the result
        System.out.println(Arrays.toString(arr));
    }

    // Helper method to reverse elements between indices i and j
    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}