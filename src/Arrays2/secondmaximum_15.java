// print second maximum element in Array
package Arrays2;

public class secondmaximum_15 {
    static void main() {
        int[] arr = {4,10,6,3,8,10};
        int n = arr.length;
        int mx = 0;
        int smx = 0;
        for (int i = 0; i <n ; i++) {
            if(arr[i]>mx) mx = arr[i];

            }
        //calculate second max
        for (int i = 0; i <n ; i++) {
            if(arr[i]>smx&& arr[i]!=mx) smx = arr[i];

        }
            System.out.println(mx);
            System.out.println(smx);
        }

    }

