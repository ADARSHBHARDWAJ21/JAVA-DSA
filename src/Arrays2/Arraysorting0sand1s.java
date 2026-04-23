package Arrays2;

public class Arraysorting0sand1s {
    public static void main(String[] args) { // Fixed: added 'public'
        int[] arr = { 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0 };
        int n = arr.length;

        // 1. Count the zeroes
        int noOfZeroes = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                noOfZeroes++;
            }
        }

        // 2. Fill the first part with 0s
        for (int i = 0; i < noOfZeroes; i++) {
            arr[i] = 0;
        }

        // 3. Fill the rest with 1s (starting from where zeroes ended)
        for (int i = noOfZeroes; i < n; i++) {
            arr[i] = 1;
        }

        // 4. Print the result
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}