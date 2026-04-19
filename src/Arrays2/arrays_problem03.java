// calculate sum of all elements in the given array
package Arrays2;

public class arrays_problem03 {
    static void main(String[] args) {
        int []arr = {34,43,22,42,4,53,23};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
           sum += arr[i];

        }
        System.out.println(sum);


    }
}
