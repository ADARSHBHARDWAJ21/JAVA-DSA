package Sorting;

public class selectionsort_12 {
    static void main(String[] args) {
        int [] arr = {-2,3,4,-9,5,1,0};
        int n = arr.length;
       // no of iterations
        for (int i = 0; i <n-1 ; i++) {
            int min = i;
            for (int j = i+1; j < n ; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
                    int temp = arr[i];
                    arr[i] = arr[min];
                    arr[min] = temp;


        }
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
