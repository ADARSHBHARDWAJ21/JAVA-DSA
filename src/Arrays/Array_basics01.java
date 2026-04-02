package Arrays;

public class Array_basics01 {
    static void main(String[] args) {
        // way 1 of initialization
        int[] x = {6,12,31,32,43,343};
        //indexing
        System.out.println(x[3]);
        //updating elements - arrays are mutable it has mutablity property
        x[3] = 89;
        //System.out.println(x[3]);
        //way 2 of initialization of array
        int[] arr = new int[4];  // 4 size ka array  | index 0 to 3
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = -80;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }

    }
}
