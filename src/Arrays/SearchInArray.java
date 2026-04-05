package Arrays;

public class SearchInArray {
    public static void main(String[] args) {
        int[] arr = {12, 43, 435, 23, 443, 54, 654, 3454, 545, 545};
        int target = 43;

        // You must declare the variable 'flag' and its type (boolean)
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Target exists in array at index " +i);
                flag = true;
                break; // Exit the loop as soon as we find it
            }
        }

        if (flag) {
            System.out.println("Target exists in Array");
        } else {
            System.out.println("Target missing in Array");
        }
    }
}