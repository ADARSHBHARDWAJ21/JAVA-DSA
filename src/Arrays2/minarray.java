package Arrays2;

public class minarray {
    static void main(String[] args) {
        int[] arr = {2,4,52,4,42,4};
        int n =arr.length;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <n ; i++) {
            if(arr[i]<min)
                min = arr[i];

        }
        System.out.println(min);

    }
}
