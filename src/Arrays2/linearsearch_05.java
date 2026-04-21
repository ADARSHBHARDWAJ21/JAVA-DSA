package Arrays2;
import java.util.Scanner;

public class linearsearch_05 {
    public static void main(String[] args) {
        int[] arr = {23, 43, 42, 2, 4, 5, 6, 45};
        int target = 43;
        int n = arr.length;
        int found = -1; // -1 target arrays me nhi hai

        // We must declare 'flag' before using it
        boolean flag = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                found = i;
                flag = true; // target found
                break;
            }
        }
         if(found!=1) System.out.println("Target exists in array at index " +found);
        if (flag == true) {
            System.out.println("Target exists in Array");
        } else {
            System.out.println("Target missing in Array");
        }
    }
}