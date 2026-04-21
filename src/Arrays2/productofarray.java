package Arrays2;

public class productofarray {
    static void main(String[] args) {
        int[] arr = {2, 4, 5, 3, 53, 2, 2};
        int n = arr.length;
        int product = 1;
        for (int i = 0; i <n ; i++) {
            product *= arr[i]; //product = product* arr[i]

        }
        System.out.println(product);


    }
}