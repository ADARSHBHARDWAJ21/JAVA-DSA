
// sum of arrays
package Arrays;

public class sumofarray_01 {
    static void main(String[] args) {
        int [] arr = {-6,5,65,65,556,56};
        int sum =0;
       // double product = 1;
        for (int i = 0; i < arr.length ; i++) {
            //product *= arr[i];
             sum += arr[i];
        }
        System.out.println(sum);
       // System.out.println(product);
    }

}
