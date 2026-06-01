package Sorting;

public class BubbleSort_3 {
    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Changed to print() so it stays on one line
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5,1,3,4,2};
        int n = arr.length;

        System.out.print("Original array: ");
        print(arr);
        // bubble sort
        for (int i = 0; i < n - 1; i++) { // n-1 passes
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted array: ");
        print(arr);
    }
}