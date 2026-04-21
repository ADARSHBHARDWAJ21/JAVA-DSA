package Arrays2;

public class Rotatearray {
    public static void main(String[] args) {
        int[] arr = {6, 8, 1, 8, 4, 9, 0};
        int n = arr.length;
        int d = 2; // Number of steps to rotate

        // Handle cases where d is greater than n
        d = d % n;

        // Step 1: Reverse the first part
        reverse(arr, 0, d - 1);
        // Step 2: Reverse the second part
        reverse(arr, d, n - 1);
        // Step 3: Reverse the whole array
        reverse(arr, 0, n - 1);

        // Print the result
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--; // Fixed: j must decrease to move inward
        }
    }
}