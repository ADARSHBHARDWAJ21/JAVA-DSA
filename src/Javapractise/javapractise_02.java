package Javapractise;

public class javapractise_02 {
    static void main(String[] args) {
        int[] arr = {-6, 8, 14, -2, 23, 47, 4, 3, 20};
        int max = arr[0];
        for (int i = 0; i <arr.length; i++) {
           // if (arr[i] < max) // min value of array
                // if(arr[i]> max) //max value of array
                max = arr[i];

        }
        System.out.println(max);
    }
}