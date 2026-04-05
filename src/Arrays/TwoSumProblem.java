//Problem Statement:
//Given an array arr[] of positive integers and another integer target. Determine if there exist two distinct indices such that the sum of their elements is equal to the target.
//
//Examples:
//
//Input: arr[] = [1, 4, 45, 6, 10, 8], target = 16
//
//Output: true
//
//Explanation: arr[3] + arr[4] = 6 + 10 = 16.
package Arrays;

public class TwoSumProblem {
    // We define the return type as 'boolean' and pass 'arr' and 'target' as arguments
    public static boolean hasTwoSum(int[] arr, int target) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Now 'arr' and 'target' are recognized because they are in the parameters
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 45, 6, 10, 8};
        int target = 16;

        // Calling the method and printing the result
        System.out.println(hasTwoSum(nums, target));
    }
}