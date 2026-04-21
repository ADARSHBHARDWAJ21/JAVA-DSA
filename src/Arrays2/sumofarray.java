package Arrays2;

public class sumofarray {
    static void main(String[] args) {
        int[] arr = {23,43,64,-2,324,43};
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i <n ; i++) {
            sum += arr[i]; // sum = sum + arr[i]

        }
        System.out.println(sum);

    }
}
