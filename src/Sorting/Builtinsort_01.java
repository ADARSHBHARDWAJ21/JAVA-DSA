
package Sorting;
import java.util.Arrays;
public class Builtinsort_01 {
    static void main(String[] args) {
        int [] arr = {2,3,6,1,9,4,5,0};
        int n = arr.length;
        for (int i = 0; i <n ; i++) {
            //  System.out.print(arr[i]+ " ");
        }
            Arrays.sort(arr);
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+ " ");

        }

        }
    }

