package Sorting;

public class selectionsort_14 {
    static void main(String[] args) {
        int [] arr = {-8,-5,-7,-9,3,5,6,7,2,0,11};
        int n = arr.length;
        for (int i = 0; i <n ; i++) {
            int min = i;
            for (int j = i+1; j <n ; j++) {
                if(arr[min]>arr[j]){
                    min = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
    }

}
