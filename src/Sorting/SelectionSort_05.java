package Sorting;

public class SelectionSort_05 {
  public  static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Changed to print() so it stays on one line
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i , int j){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
    static void main(String[] args) {

        int[] arr = {10,-4,20,1,-6,8};
        int n = arr.length;
        print(arr);
        //int mindx = -1; // use to find index of the min value
        for (int i = 0; i <n-1 ; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for(int j = i; j<n; j++){
                if(arr[j]<min){
                    min = arr[j];
                    mindx = j;
                }

            }
            // swap arr[i] and mindx[]
            swap(arr,i,mindx);

        }
        print(arr);
    }
}
