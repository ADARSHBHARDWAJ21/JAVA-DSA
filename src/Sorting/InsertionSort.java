package Sorting;


    public class InsertionSort {

        static void insertionSort(int[] arr) {

            int n = arr.length;

            for (int i = 1; i < n; i++) {

                int current = arr[i];
                int j;

                for (j = i - 1; j >= 0 && arr[j] > current; j--) {
                    arr[j + 1] = arr[j];
                }

                arr[j + 1] = current;
            }
        }

        public static void main(String[] args) {

            int[] arr = {5, 3, 4, 1};

            insertionSort(arr);

            for (int num : arr) {
                System.out.print(num + " ");
            }

    }
}
