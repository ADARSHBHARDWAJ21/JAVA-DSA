// Priont max elment of array
package Arrays;

public class arraysmax_04 {
    // Added 'public' and 'String[] args' to make it a valid entry point
    public static void main(String[] args) {
        int[] arr = {-6, 8, 14, -2, 23, 47, 4, 3, 10};

        // Initialize max with the first element of array
        int max = arr[0];
// running a loop to compare values in array
        for (int i = 1; i < arr.length; i++) {
            // If the current element is greater than our current max, update max
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("The maximum element is: " + max);
    }
}

