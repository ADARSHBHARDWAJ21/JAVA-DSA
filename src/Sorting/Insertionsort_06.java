package Sorting;

public class Insertionsort_06 {
    static void main(String[] args) {

        int[] arr = {10, -4, 20, 7, -6, 8};
        int n = arr.length;

        // Print original array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Insertion Sort
        for (int i = 1; i < n; i++) {

            for (int j = i; j >= 1; j--) {

                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                } else {
                    break;
                }
            }
        }

        // Print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

