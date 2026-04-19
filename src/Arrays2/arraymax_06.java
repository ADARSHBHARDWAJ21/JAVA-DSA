// find the maximum value out of all elements
package Arrays2;

public class arraymax_06 {
    static void main(String[] args) {
        int[] arr = {-3, 5, 67, 89, 76, 54, 33};
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>mx)mx = arr[i];


        }
        System.out.println(mx);

    }
}
