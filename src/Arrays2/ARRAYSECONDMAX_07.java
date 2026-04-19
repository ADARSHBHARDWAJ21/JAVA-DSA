package Arrays2;

public class ARRAYSECONDMAX_07 {
    static void main(String[] args) {
        int[] arr = {-3, 5, 67, 89, 76, 54, 33};
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            //if(arr[i]>mx)mx = arr[i];
            mx = Math.max(mx,arr[i]);
        }
        int smx = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>smx && arr[i] != mx) smx = arr[i];
        }
        System.out.println(mx);
        System.out.println(smx);

    }
}
