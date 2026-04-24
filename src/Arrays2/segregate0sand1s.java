package Arrays2;

import java.util.Arrays;

 class Segregate0sand1s { // Class names should be PascalCase
    public static void main(String[] args) { // Added 'public'
        int[] arr = {1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0};
        int n = arr.length;

        int i = 0, j = n - 1;

        while (i < j) {
            // Move i forward as long as it points to 0
            if (arr[i] == 0) {
                i++;
            }
            // Move j backward as long as it points to 1
            else if (arr[j] == 1) {
                j--;
            }
            // If i points to 1 and j points to 0, swap them
            else {
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }

        // Print the result to verify
        System.out.println("Segregated Array: " + Arrays.toString(arr));
    }
}