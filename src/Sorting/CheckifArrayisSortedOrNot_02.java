package Sorting;

public class CheckifArrayisSortedOrNot_02 {
    static void main(String[] args) {
        int[] arr = {1,7,3,9,12,13};
        int n = arr.length;
        boolean flag = true; // true means sorted
        for (int i = 0; i <n ; i++) {
            if(arr[i]>arr[i+1]){
                flag = false; // false -> unsorted array
                break;
            }

        }
        if (flag == true) System.out.println("Sorted array");
        else System.out.println("Unsorted array");

    }
}
