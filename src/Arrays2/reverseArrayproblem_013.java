// write a program to reverse the array without using any extra array
package Arrays2;
import java.util.Arrays;

public class reverseArrayproblem_013 {
    static void main(String[] args) {
        int[] arr = {3, 19, 56, 9, 83, 18, 24, 85, 14,78};
        int n = arr.length;
        int i = 0, j = n - 1;
        while (i < j)  {  // i is index   , j is also index
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }}