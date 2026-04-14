package Arrays;
import java.util.Arrays;

public class Builtinmethods {
    static void main(String[] args) {
    int [] arr = {30,40,20,33,23,2,332,32};
    // for each loop
    for(int ele : arr){
        System.out.println(ele+ " ");
    }
    Arrays.sort(arr);  // used for sortiing arrays(builtin method)
        System.out.println();
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+ " ");

        }
}
}
