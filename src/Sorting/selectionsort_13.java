package Sorting;

public class selectionsort_13 {
    static void main(String[] args) {
        int[] arr = {9, -4, -3, 6, 7, -1, 0, 5};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[min] > arr[j])
                    min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for (int i = 0; i <n ; i++) {
            System.out.println(arr[i] + " ");

        }
    }
}