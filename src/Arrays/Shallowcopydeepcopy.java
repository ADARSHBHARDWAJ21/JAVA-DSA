package Arrays;
import java.util.Arrays;
public class Shallowcopydeepcopy {
    static void main(String[] args) {
        int a = 4; // 4byte leta hai
        int [] arr = {10,20,30,40}; // 16 byte leta hai
        int []x = arr; // x is shallow copy of arr  x == arr
        x[0] = 100;
        int[] deep = Arrays.copyOf(arr,arr.length);
        deep[0] = 100;

        System.out.println(arr[0]);

    }
}
