package Arrays;
import java.util.Arrays;
public class copyofarray {
    static void main(String[] args) {
        int[] arr = {32,43,43,23,12,54,24,54,34};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int[] nums = arr; // shallow copy dhung se copy nhi hua
        nums[0] = 70;
        //System.out.print(arr[0]);
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i]+ " ");
//DEEP COPY
        int[] brr = Arrays.copyOf(arr,arr.length);
        for (int ele : brr){
            System.out.print(ele+ " ");
            brr[0] = 70;

        }
        }

    }

