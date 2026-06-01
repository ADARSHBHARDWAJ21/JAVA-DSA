// sort the array {10,-4,20,1,-6,8} using selection sort
package Sorting;

public class selectionsortpractise {
    static void main(String[] args) {

            int[] arr = {10, -4, 20, 1, -6, 8};
            int n = arr.length;

            // Print original array
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            // Selection Sort
            for (int i = 0; i < n - 1; i++) {

                int mindx = i;

                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[mindx]) {
                        mindx = j;
                    }
                }

                // Swap
                int temp = arr[i];
                arr[i] = arr[mindx];
                arr[mindx] = temp;
            }

            // Print sorted array
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }

    }}