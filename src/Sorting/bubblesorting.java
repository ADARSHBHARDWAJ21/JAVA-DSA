// sort the array using bubble sort -{5,-1,3,4,-2,0}
package Sorting;

public class bubblesorting {
    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Changed to print() so it stays on one line
        }
        System.out.println();
    }

    static void main(String[] args) {
        int arr[] = {5, -1, 3, 4, -2, 0};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {  // n-1 is no of swaps
            for (int j = 0; j < n - 1 - i; j++) {
                // swap elements
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;

                }

            }
        }
        System.out.println("The sorted array is : ");
        print(arr);
    }
}